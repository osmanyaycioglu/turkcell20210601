package com.training.spring.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DIConfig {

    @Bean
    @Qualifier("testSecond1")
    public ISecondObject createSecondObject() {
        MySecondObject ref1 = new MySecondObject();
        ref1.setInfo("test");
        return ref1;
    }

    @Bean
    @Qualifier("testSecond2")
    public ISecondObject createSecondObject2() {
        MySecondObject ref1 = new MySecondObject();
        ref1.setInfo("test2");
        return ref1;
    }

    @Bean
    @Qualifier("testSecond3")
    public MyDynSecondObject createDynSecondObject() {
        return new MyDynSecondObject("extra info from osman");
    }

}
