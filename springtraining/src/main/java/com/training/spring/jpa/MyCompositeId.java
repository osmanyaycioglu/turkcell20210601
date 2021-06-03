package com.training.spring.jpa;

// @Embeddable
public class MyCompositeId {

    private String str1;
    private String str2;

    public String getStr1() {
        return this.str1;
    }

    public void setStr1(final String str1Param) {
        this.str1 = str1Param;
    }

    public String getStr2() {
        return this.str2;
    }

    public void setStr2(final String str2Param) {
        this.str2 = str2Param;
    }

}
