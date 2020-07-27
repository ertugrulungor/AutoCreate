package com.github.ertugrulungor.creators;

import java.util.ArrayList;
import java.util.List;

public class IntegerValueCreator<T> extends BaseValueCreator<Integer> {
    @Override
    protected Integer createSimple() {
        return getValue();
    }

    @Override
    protected List<Integer> createList() {
        List<Integer> integers = new ArrayList<>();
        integers.add(getValue());
        integers.add(getValue());
        integers.add(getValue());
        return integers;
    }

    @Override
    protected Integer[] createObjectArray() {
        Integer[] integers = new Integer[defaultListSize];
        for (int i = 0; i < defaultListSize; i++) {
            integers[i] = getValue();
        }
        return integers;
    }

    @Override
    protected Object createPrimitiveArray() {
        int[] integers = new int[defaultListSize];
        for (int i = 0; i < defaultListSize; i++) {
            integers[i] = getValue();
        }
        return integers;
    }

    private Integer getValue() {
        return (int) (Math.random() * Integer.MAX_VALUE + 1);
    }
}
