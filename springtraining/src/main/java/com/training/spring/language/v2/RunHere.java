package com.training.spring.language.v2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RunHere implements CommandLineRunner {

    @Autowired
    @Qualifier("v2")
    private Language lang;

    @Override
    public void run(final String... argsParam) throws Exception {
        System.out.println("v2 çalışıyor");
        this.lang.hello();
    }

}
