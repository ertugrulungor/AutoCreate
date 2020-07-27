package com.github.ertugrulungor.creators;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DateValueCreator<T> extends BaseValueCreator<Date> {
    @Override
    protected Date createSimple() {
        return getValue();
    }

    @Override
    protected List<Date> createList() {
        List<Date> dates = new ArrayList<>();
        dates.add(getValue());
        dates.add(getValue());
        dates.add(getValue());
        return dates;
    }

    @Override
    protected Date[] createObjectArray() {
        Date[] dates = new Date[defaultListSize];
        for (int i = 0; i < defaultListSize; i++) {
            dates[i] = getValue();
        }
        return dates;
    }

    @Override
    protected Object createPrimitiveArray() {
        return null;
    }

    private Date getValue() {
        return new Date();
    }
}
