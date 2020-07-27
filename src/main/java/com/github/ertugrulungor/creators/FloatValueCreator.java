package com.github.ertugrulungor.creators;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FloatValueCreator<T> extends BaseValueCreator<Float> {
    @Override
    protected Float createSimple() {
        return getValue();
    }

    @Override
    protected List<Float> createList() {
        List<Float> floats = new ArrayList<>();
        floats.add(getValue());
        floats.add(getValue());
        floats.add(getValue());
        return floats;
    }

    @Override
    protected Float[] createObjectArray() {
        Float[] floats = new Float[defaultListSize];
        for (int i = 0; i < defaultListSize; i++) {
            floats[i] = getValue();
        }
        return floats;
    }

    @Override
    protected Object createPrimitiveArray() {
        float[] floats = new float[defaultListSize];
        for (int i = 0; i < defaultListSize; i++) {
            floats[i] = getValue();
        }
        return floats;
    }

    private Float getValue() {
        float min = 1;
        float max = Float.MAX_VALUE;
        Random rand = new Random();
        return rand.nextFloat() * (max - min) + min;
    }
}
