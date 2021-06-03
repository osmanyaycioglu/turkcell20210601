package com.training.spring.scope;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class MyBean {

    private String str;
    private int    intVal;

    public String getStr() {
        return this.str;
    }

    public void setStr(final String strParam) {
        this.str = strParam;
    }

    public int getIntVal() {
        return this.intVal;
    }

    public void setIntVal(final int intValParam) {
        this.intVal = intValParam;
    }

    @Override
    public String toString() {
        return "MyBean [str=" + this.str + ", intVal=" + this.intVal + "] " + super.toString();
    }


}
