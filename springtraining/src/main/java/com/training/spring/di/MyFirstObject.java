package com.training.spring.di;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "xyz")
public class MyFirstObject implements IFirstObject {

    private String name;

    // 2
    // @Qualifier("myNewSecondObject")
    @Qualifier("newSecond")
    @Autowired
    private ISecondObject second;


    public MyFirstObject() {
        // 1
    }

    // 3
    @PostConstruct
    public void init() {
        this.name = "osman";
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    @Override
    public ISecondObject getSecond() {
        return this.second;
    }

    public void setSecond(final ISecondObject secondParam) {
        this.second = secondParam;
    }

}
