package com.github.ertugrulungor.testclass;

import java.util.List;

public class ClassContainsObject {
    private TestObject testObject;
    private List<TestObject> testObjectList;
    private TestObject[] testObjectArray;

    public TestObject getTestObject() {
        return testObject;
    }

    public void setTestObject(TestObject testObject) {
        this.testObject = testObject;
    }

    public List<TestObject> getTestObjectList() {
        return testObjectList;
    }

    public void setTestObjectList(List<TestObject> testObjectList) {
        this.testObjectList = testObjectList;
    }

    public TestObject[] getTestObjectArray() {
        return testObjectArray;
    }

    public void setTestObjectArray(TestObject[] testObjectArray) {
        this.testObjectArray = testObjectArray;
    }
}