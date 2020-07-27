package com.github.ertugrulungor.creators;

import java.util.ArrayList;
import java.util.List;

public class DoubleValueCreator<T> extends BaseValueCreator<Double> {
    @Override
    protected Double createSimple() {
        return getValue();
    }

    @Override
    protected List<Double> createList() {
        List<Double> doubles = new ArrayList<>();
        doubles.add(getValue());
        doubles.add(getValue());
        doubles.add(getValue());
        return doubles;
    }

    @Override
    protected Double[] createObjectArray() {
        Double[] doubles = new Double[defaultListSize];
        for (int i = 0; i < defaultListSize; i++) {
            doubles[i] = getValue();
        }
        return doubles;
    }

    @Override
    protected Object createPrimitiveArray() {
        double[] doubles = new double[defaultListSize];
        for (int i = 0; i < defaultListSize; i++) {
            doubles[i] = getValue();
        }
        return doubles;
    }

    private Double getValue() {
        double min = 1.0;
        double max = Double.MAX_VALUE;
        double x = (Math.random() * ((max - min) + 1)) + min;
        return Math.round(x * 100.0) / 100.0;
    }
}
