package com.github.ertugrulungor.creators;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class StringValueCreator<T> extends BaseValueCreator<String> {
    @Override
    protected String createSimple() {
        return getValue();
    }

    @Override
    protected List<String> createList() {
        List<String> strings = new ArrayList<>();
        strings.add(getValue());
        strings.add(getValue());
        strings.add(getValue());
        return strings;
    }

    @Override
    protected String[] createObjectArray() {
        String[] strings = new String[defaultListSize];
        for (int i = 0; i < defaultListSize; i++) {
            strings[i] = getValue();
        }
        return strings;
    }

    @Override
    protected Object createPrimitiveArray() {
        return null;
    }

    private String getValue() {
        return UUID.randomUUID().toString();
    }
}
