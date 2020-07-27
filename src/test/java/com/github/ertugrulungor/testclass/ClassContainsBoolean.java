package com.github.ertugrulungor.testclass;

import java.util.Arrays;
import java.util.List;

public class ClassContainsBoolean {
    private Boolean objectBoolean;
    private boolean primitiveBoolean;
    private List<Boolean> objectBooleanList;
    private boolean[] primitiveBooleanArray;
    private Boolean[] objectBooleanArray;

    public Boolean getObjectBoolean() {
        return objectBoolean;
    }

    public void setObjectBoolean(Boolean objectBoolean) {
        this.objectBoolean = objectBoolean;
    }

    public boolean isPrimitiveBoolean() {
        return primitiveBoolean;
    }

    public void setPrimitiveBoolean(boolean primitiveBoolean) {
        this.primitiveBoolean = primitiveBoolean;
    }

    public List<Boolean> getObjectBooleanList() {
        return objectBooleanList;
    }

    public void setObjectBooleanList(List<Boolean> objectBooleanList) {
        this.objectBooleanList = objectBooleanList;
    }

    public boolean[] getPrimitiveBooleanArray() {
        return primitiveBooleanArray;
    }

    public void setPrimitiveBooleanArray(boolean[] primitiveBooleanArray) {
        this.primitiveBooleanArray = primitiveBooleanArray;
    }

    public Boolean[] getObjectBooleanArray() {
        return objectBooleanArray;
    }

    public void setObjectBooleanArray(Boolean[] objectBooleanArray) {
        this.objectBooleanArray = objectBooleanArray;
    }

    @Override
    public String toString() {
        return "ClassContainsBoolean{" +
                "objectBoolean=" + objectBoolean +
                ", primitiveBoolean=" + primitiveBoolean +
                ", objectBooleanList=" + objectBooleanList +
                ", primitiveBooleanArray=" + Arrays.toString(primitiveBooleanArray) +
                ", objectBooleanArray=" + Arrays.toString(objectBooleanArray) +
                '}';
    }
}