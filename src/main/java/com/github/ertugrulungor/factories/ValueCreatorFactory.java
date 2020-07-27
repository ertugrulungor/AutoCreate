package com.github.ertugrulungor.factories;

import com.github.ertugrulungor.creators.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ValueCreatorFactory {
    public BaseValueCreator getValueCreator(Class<?> fieldType) {
        var creatorMap = getValueCreatorMap();

        return creatorMap.get(fieldType);
    }

    private Map<Class<?>, BaseValueCreator> getValueCreatorMap() {
        return new HashMap<>() {
            {
                put(Integer.class, new IntegerValueCreator());
                put(int.class, new IntegerValueCreator());
                put(String.class, new StringValueCreator());
                put(Double.class, new DoubleValueCreator());
                put(double.class, new DoubleValueCreator());
                put(Short.class, new ShortValueCreator());
                put(short.class, new ShortValueCreator());
                put(Long.class, new LongValueCreator());
                put(long.class, new LongValueCreator());
                put(Float.class, new FloatValueCreator());
                put(float.class, new FloatValueCreator());
                put(Character.class, new CharValueCreator());
                put(char.class, new CharValueCreator());
                put(Boolean.class, new BooleanValueCreator());
                put(boolean.class, new BooleanValueCreator());
                put(Byte.class, new ByteValueCreator());
                put(byte.class, new ByteValueCreator());
                put(Date.class, new DateValueCreator());
            }
        };
    }
}
