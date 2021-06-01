package com.training.spring.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("second")
@Component // mySecondObject
public class MySecondObject implements ISecondObject {

    private String info;


    public MySecondObject() {
        this.info = "info 1";
    }

    @Override
    public String getInfo() {
        return this.info;
    }


    public void setInfo(final String infoParam) {
        this.info = infoParam;
    }


}
