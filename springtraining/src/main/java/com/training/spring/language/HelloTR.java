package com.training.spring.language;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("TurkishHello")
@Component
public class HelloTR implements IHello {

    @Override
    public void sayHello() {
        System.out.println("Merhaba");
    }

}
