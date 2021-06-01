package com.training.spring.language;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("SpanishHello")
@Component
public class HelloESP implements IHello {

    @Override
    public void sayHello() {
        System.out.println("Ola");
    }

}
