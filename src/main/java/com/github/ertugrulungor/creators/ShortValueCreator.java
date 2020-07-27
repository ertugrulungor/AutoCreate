package com.github.ertugrulungor.creators;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShortValueCreator<T> extends BaseValueCreator<Short> {
    @Override
    protected Short createSimple() {
        return getValue();
    }

    @Override
    protected List<Short> createList() {
        List<Short> shorts = new ArrayList<>();
        shorts.add(getValue());
        shorts.add(getValue());
        shorts.add(getValue());
        return shorts;
    }

    @Override
    protected Short[] createObjectArray() {
        Short[] shorts = new Short[defaultListSize];
        for (int i = 0; i < defaultListSize; i++) {
            shorts[i] = getValue();
        }
        return shorts;
    }

    @Override
    protected Object createPrimitiveArray() {
        short[] shorts = new short[defaultListSize];
        for (int i = 0; i < defaultListSize; i++) {
            shorts[i] = getValue();
        }
        return shorts;
    }

    private Short getValue() {
        short maxValue = Short.MAX_VALUE;
        short minValue = 1;
        return (short) (new Random().nextInt((maxValue - minValue) + 1) + minValue);
    }
}
