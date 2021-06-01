package com.training.spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DIConfig2 {

    @Bean
    public ISecondObject createSecond1() {
        MySecondObject ref1 = new MySecondObject();
        ref1.setInfo("test");
        return ref1;
    }

    @Bean
    public ISecondObject createSecond2() {
        MySecondObject ref1 = new MySecondObject();
        ref1.setInfo("test2");
        return ref1;
    }

    @Bean
    public MyDynSecondObject createSecond3() {
        return new MyDynSecondObject("extra info from osman");
    }

}
