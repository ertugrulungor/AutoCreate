package com.github.ertugrulungor.creators;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ByteValueCreator<T> extends BaseValueCreator<Byte> {
    @Override
    protected Byte createSimple() {
        return getValue();
    }

    @Override
    protected List<Byte> createList() {
        List<Byte> bytes = new ArrayList<>();
        bytes.add(getValue());
        bytes.add(getValue());
        bytes.add(getValue());
        return bytes;
    }

    @Override
    protected Byte[] createObjectArray() {
        Byte[] bytes = new Byte[defaultListSize];
        for (int i = 0; i < defaultListSize; i++) {
            bytes[i] = getValue();
        }
        return bytes;
    }

    @Override
    protected Object createPrimitiveArray() {
        byte[] bytes = new byte[defaultListSize];
        for (int i = 0; i < defaultListSize; i++) {
            bytes[i] = getValue();
        }
        return bytes;
    }

    private Byte getValue() {
        byte[] b = new byte[1];
        new Random().nextBytes(b);
        return b[0];
    }
}
