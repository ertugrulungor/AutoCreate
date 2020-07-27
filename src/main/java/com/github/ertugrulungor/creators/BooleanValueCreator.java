package com.github.ertugrulungor.creators;

import java.util.ArrayList;
import java.util.List;

public class BooleanValueCreator<T> extends BaseValueCreator<Boolean> {
    @Override
    protected Boolean createSimple() {
        return getValue();
    }

    @Override
    protected List<Boolean> createList() {
        List<Boolean> booleans = new ArrayList<>();
        booleans.add(getValue());
        booleans.add(getValue());
        booleans.add(getValue());
        return booleans;
    }

    @Override
    protected Boolean[] createObjectArray() {
        Boolean[] booleans = new Boolean[defaultListSize];
        for (int i = 0; i < defaultListSize; i++) {
            booleans[i] = getValue();
        }
        return booleans;
    }

    @Override
    protected Object createPrimitiveArray() {
        boolean[] booleans = new boolean[defaultListSize];
        for (int i = 0; i < defaultListSize; i++) {
            booleans[i] = getValue();
        }
        return booleans;
    }

    private boolean getValue() {
        return true;
    }
}
