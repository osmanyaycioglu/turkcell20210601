package com.training.spring.language;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("EnglishHello")
@Component
public class HelloENG implements IHello {

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }

}
