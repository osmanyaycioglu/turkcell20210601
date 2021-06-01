package com.training.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.training.spring.di.IFirstObject;
import com.training.spring.di.MyFirstObject;

public class SpringRunner {

    public static void main(final String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringtrainingApplication.class,
                                                                       args);
        MyFirstObject firstObjectLoc = (MyFirstObject) context.getBean("xyz");
        MyFirstObject firstObjectLoc2 = context.getBean(MyFirstObject.class);
        IFirstObject first = context.getBean(IFirstObject.class);

        String infoLoc = firstObjectLoc.getSecond()
                                       .getInfo();
        System.out.println("After run line : " + infoLoc);

        System.out.println("After run line 2 : "
                           + firstObjectLoc2.getSecond()
                                            .getInfo());
    }

}
