package com.github.ertugrulungor.testclass;

import java.util.Date;
import java.util.List;

public class ClassContainsDate {
    private Date objectDate;
    private List<Date> objectDateList;
    private Date[] objectDateArray;

    public Date getObjectDate() {
        return objectDate;
    }

    public void setObjectDate(Date objectDate) {
        this.objectDate = objectDate;
    }

    public List<Date> getObjectDateList() {
        return objectDateList;
    }

    public void setObjectDateList(List<Date> objectDateList) {
        this.objectDateList = objectDateList;
    }

    public Date[] getObjectDateArray() {
        return objectDateArray;
    }

    public void setObjectDateArray(Date[] objectDateArray) {
        this.objectDateArray = objectDateArray;
    }
}
