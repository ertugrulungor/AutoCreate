package com.github.ertugrulungor.creators;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CharValueCreator<T> extends BaseValueCreator<Character> {
    @Override
    protected Character createSimple() {
        return getValue();
    }

    @Override
    protected List<Character> createList() {
        List<Character> characters = new ArrayList<>();
        characters.add(getValue());
        characters.add(getValue());
        characters.add(getValue());
        return characters;
    }

    @Override
    protected Character[] createObjectArray() {
        Character[] characters = new Character[defaultListSize];
        for (int i = 0; i < defaultListSize; i++) {
            characters[i] = getValue();
        }
        return characters;
    }

    @Override
    protected Object createPrimitiveArray() {
        char[] characters = new char[defaultListSize];
        for (int i = 0; i < defaultListSize; i++) {
            characters[i] = getValue();
        }
        return characters;
    }

    private Character getValue() {
        Random r = new Random();
        return (char) (r.nextInt(26) + 'a');
    }
}
