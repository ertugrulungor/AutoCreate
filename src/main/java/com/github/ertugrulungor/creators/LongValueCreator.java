package com.github.ertugrulungor.creators;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LongValueCreator<T> extends BaseValueCreator<Long> {
    @Override
    protected Long createSimple() {
        return getValue();
    }

    @Override
    protected List<Long> createList() {
        List<Long> longs = new ArrayList<>();
        longs.add(getValue());
        longs.add(getValue());
        longs.add(getValue());
        return longs;
    }

    @Override
    protected Long[] createObjectArray() {
        Long[] longs = new Long[defaultListSize];
        for (int i = 0; i < defaultListSize; i++) {
            longs[i] = getValue();
        }
        return longs;
    }

    @Override
    protected Object createPrimitiveArray() {
        long[] longs = new long[defaultListSize];
        for (int i = 0; i < defaultListSize; i++) {
            longs[i] = getValue();
        }
        return longs;
    }

    private Long getValue() {
        long x = 1;
        long y = Long.MAX_VALUE;
        Random r = new Random();
        return x + ((long) (r.nextDouble() * (y - x)));
    }
}
