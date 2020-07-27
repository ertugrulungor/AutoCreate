package com.github.ertugrulungor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class AutoCreate<T> {
    private T instance;
    private final Class<T> clazz;
    private final List<Consumer<T>> setters = new ArrayList<>();

    public AutoCreate(Class<T> clazz) {
        this.clazz = clazz;
        try {
            AutoFill<T> autoFill = new AutoFill<>();
            instance = autoFill.fill(clazz);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static <T> AutoCreate<T> build(Class<T> clazz) {
        return new AutoCreate<>(clazz);
    }

    public AutoCreate<T> with(Consumer<T> setter) {
        setters.add(setter);
        return this;
    }

    public T create() {
        setUserCustomFields(instance);

        return instance;
    }

    public List<T> createMany() {
        List<T> list = new ArrayList<>();
        list.add(instance);
        setUserCustomFields(instance);
        try {
            for (int i = 0; i < 2; i++) {
                AutoFill<T> autoFill = new AutoFill<>();
                var newInstance = autoFill.fill(clazz);

                setUserCustomFields(newInstance);
                list.add(newInstance);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    private void setUserCustomFields(T instance) {
        for (Consumer<T> setter : setters) {
            setter.accept(instance);
        }
    }
}
