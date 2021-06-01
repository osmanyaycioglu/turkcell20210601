package com.training.spring.di;

public class MyDynSecondObject implements ISecondObject {

    private String info;

    public MyDynSecondObject(final String str) {
        this.info = str;
    }

    @Override
    public String getInfo() {
        return this.info;
    }


    public void setInfo(final String infoParam) {
        this.info = infoParam;
    }


}
