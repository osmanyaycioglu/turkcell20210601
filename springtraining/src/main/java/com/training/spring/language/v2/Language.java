package com.training.spring.language.v2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Language {

    @Autowired
    @Qualifier("helloV2")
    private IHello hello;

    public void hello() {
        this.hello.sayHello();
    }

}
