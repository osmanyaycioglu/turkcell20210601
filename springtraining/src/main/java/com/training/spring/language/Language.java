package com.training.spring.language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("v1")
public class Language {

    @Autowired
    @Qualifier("SpanishHello")
    private IHello hello;

    public void hello() {
        this.hello.sayHello();
    }

}
