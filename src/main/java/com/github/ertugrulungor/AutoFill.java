package com.github.ertugrulungor;

import com.github.ertugrulungor.enums.CreationType;
import com.github.ertugrulungor.factories.ValueCreatorFactory;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class AutoFill<T> {
    protected final Integer defaultArraySize = 3;

    public T fill(Class<T> clazz) {
        try {
            if (isClassKnownJavaClass(clazz)) {
                return getKnownJavaClassValue(clazz, CreationType.SIMPLE);
            } else if (clazz.isArray()) {
                return getInstanceForArray(clazz);
            }

            return getInstanceForUnknownObject(clazz);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private T getInstanceForArray(Class<T> clazz) {
        var componentType = clazz.getComponentType();
        Object array = Array.newInstance(componentType, 3);
        for (int i = 0; i < defaultArraySize; i++) {
            Array.set(array, i, fill((Class<T>) componentType));
        }

        return (T) array;
    }

    private T getInstanceForUnknownObject(Class<T> clazz) throws Exception {
        var instance = clazz.getDeclaredConstructor().newInstance();

        var declaredFields = getDeclaredFields(clazz);
        var assigner = new Assigner<T>();
        for (var field : declaredFields) {
            field.setAccessible(true);
            assigner.assign(field, instance);
        }

        return instance;
    }

    private List<Field> getDeclaredFields(Class<T> clazz) throws Exception {
        var instance = clazz.getDeclaredConstructor().newInstance();
        var declaredFields = new ArrayList<Field>();
        Class<?> superclass = instance.getClass().getSuperclass();
        if (!Object.class.equals(superclass)) {
            var superclassDeclaredFields = getDeclaredFields((Class<T>) superclass);
            declaredFields.addAll(superclassDeclaredFields);
        }

        declaredFields.addAll(Arrays.asList(clazz.getDeclaredFields()));

        return declaredFields;
    }

    private T getKnownJavaClassValue(Class<?> type, CreationType creationType) {
        var valueCreatorFactory = new ValueCreatorFactory();
        var valueCreator = valueCreatorFactory.getValueCreator(type);
        return (T) valueCreator.create(creationType);
    }

    private boolean isClassKnownJavaClass(Class<?> instanceClass) {
        return getKnownJavaClasses().contains(instanceClass);
    }

    private static List<Class<?>> getKnownJavaClasses() {
        var knownJavaClasses = new ArrayList<Class<?>>();
        knownJavaClasses.add(Integer.class);
        knownJavaClasses.add(int.class);
        knownJavaClasses.add(String.class);
        knownJavaClasses.add(Double.class);
        knownJavaClasses.add(double.class);
        knownJavaClasses.add(Short.class);
        knownJavaClasses.add(short.class);
        knownJavaClasses.add(Long.class);
        knownJavaClasses.add(long.class);
        knownJavaClasses.add(Float.class);
        knownJavaClasses.add(float.class);
        knownJavaClasses.add(Character.class);
        knownJavaClasses.add(char.class);
        knownJavaClasses.add(Boolean.class);
        knownJavaClasses.add(boolean.class);
        knownJavaClasses.add(Byte.class);
        knownJavaClasses.add(byte.class);
        knownJavaClasses.add(Date.class);

        return knownJavaClasses;
    }
}
