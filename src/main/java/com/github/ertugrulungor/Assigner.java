package com.github.ertugrulungor;

import com.github.ertugrulungor.enums.CreationType;
import com.github.ertugrulungor.factories.ValueCreatorFactory;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;

public class Assigner<T> {
    private T instance;

    public void assign(Field field, T instance) throws IllegalAccessException, ClassNotFoundException {
        this.instance = instance;

        var fieldType = field.getType();
        var valueCreatorFactory = new ValueCreatorFactory();

        var creationType = getCreationType(fieldType);
        var type = getType(field, creationType);
        var valueCreator = valueCreatorFactory.getValueCreator(type);

        if (valueCreator != null) {
            var object = valueCreator.create(creationType);
            field.set(instance, object);
        } else {
            setField(field, type, creationType);
        }
    }

    private void setField(Field field, Class<?> type, CreationType creationType) throws IllegalAccessException {
        var autoFill = new AutoFill<T>();
        switch (creationType) {
            case SIMPLE:
                createFieldForSimpleObject(field, type, autoFill);
                break;
            case PRIMITIVE_ARRAY:
            case OBJECT_ARRAY:
                createFieldForArray(field, type, autoFill);
                break;
            case COLLECTION:
                createFieldForCollection(field, type, autoFill);
                break;
        }
    }

    private void createFieldForCollection(Field field, Class<?> type, AutoFill<T> autoFill) throws IllegalAccessException {
        Object[] array = getArrayForGenericType(type, autoFill);
        field.set(instance, Arrays.asList(array));
    }

    private void createFieldForArray(Field field, Class<?> type, AutoFill<T> autoFill) throws IllegalAccessException {
        Object[] array = getArrayForGenericType(type, autoFill);
        field.set(instance, array);
    }

    private void createFieldForSimpleObject(Field field, Class<?> type, AutoFill<T> autoFill) throws IllegalAccessException {
        var object = autoFill.fill((Class<T>) type);
        field.set(instance, object);
    }

    private Object[] getArrayForGenericType(Class<?> type, AutoFill<T> autoFill) {
        Object[] array = (Object[]) Array.newInstance(type, 3);
        Array.set(array, 0, autoFill.fill((Class<T>) type));
        Array.set(array, 1, autoFill.fill((Class<T>) type));
        Array.set(array, 2, autoFill.fill((Class<T>) type));
        return array;
    }

    private CreationType getCreationType(Class<?> type) {
        if (Collection.class.isAssignableFrom(type)) {
            return CreationType.COLLECTION;
        } else if (type.isArray()) {
            var componentType = type.getComponentType();
            return componentType.isPrimitive() ? CreationType.PRIMITIVE_ARRAY : CreationType.OBJECT_ARRAY;
        }

        return CreationType.SIMPLE;
    }

    private Class<?> getType(Field field, CreationType creationType) throws ClassNotFoundException {
        var fieldType = field.getType();
        switch (creationType) {
            case SIMPLE:
                return fieldType;
            case PRIMITIVE_ARRAY:
            case OBJECT_ARRAY:
                return fieldType.getComponentType();
            case COLLECTION:
                Type[] argTypes = getArgumentTypes(field);
                return Class.forName(argTypes[0].getTypeName());
            default:
                return null;
        }
    }

    private Type[] getArgumentTypes(Field field) {
        Type returnType = field.getGenericType();
        if (returnType instanceof ParameterizedType) {
            ParameterizedType paramType = (ParameterizedType) returnType;
            return paramType.getActualTypeArguments();
        }

        return new Type[0];
    }
}
