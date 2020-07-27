package com.github.ertugrulungor.creators;

import com.github.ertugrulungor.enums.CreationType;

import java.util.List;

public abstract class BaseValueCreator<T> implements ValueCreator<Object> {
    protected final Integer defaultListSize = 3;

    @Override
    public Object create(CreationType creationType) {
        switch (creationType) {
            case SIMPLE:
                return createSimple();
            case COLLECTION:
                return createList();
            case OBJECT_ARRAY:
                return createObjectArray();
            case PRIMITIVE_ARRAY:
                return createPrimitiveArray();
            default:
                throw new IllegalStateException("Unexpected value: " + creationType);
        }
    }

    protected abstract T createSimple();

    protected abstract List<T> createList();

    protected abstract T[] createObjectArray();

    protected abstract Object createPrimitiveArray();
}
