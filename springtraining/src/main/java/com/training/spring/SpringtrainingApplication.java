package com.training.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.training.spring.di.IFirstObject;
import com.training.spring.language.Language;

// @Service
// @Controller
// @Repository
// @Configuration


@SpringBootApplication
public class SpringtrainingApplication implements ApplicationRunner {

    @Autowired
    private IFirstObject firstObject;

    @Autowired
    @Qualifier("v1")
    private Language     language;


    @Override
    public void run(final ApplicationArguments argsParam) throws Exception {
        this.language.hello();
        String infoLoc = this.firstObject.getSecond()
                                         .getInfo();
        System.out.println(infoLoc);
    }

}
