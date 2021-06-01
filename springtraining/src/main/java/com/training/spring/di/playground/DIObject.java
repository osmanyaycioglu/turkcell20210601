package com.training.spring.di.playground;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import com.training.spring.di.IFirstObject;

@Component
// @Lazy
public class DIObject implements ApplicationContextAware, BeanNameAware {

    // Field Injection [2]
    @Autowired
    private IFirstObject       fieldFirstObject;
    private final IFirstObject constructorFirstObject;
    private IFirstObject       methodFirstObject;

    @Autowired
    private ApplicationContext appContext;

    // Constructor Injection [1]
    @Autowired
    public DIObject(final IFirstObject constructorFirstObject) {
        this.constructorFirstObject = constructorFirstObject;
    }

    // Method Injection  [3]
    @Autowired
    public void xyz(final IFirstObject methodFirstObject) {
        this.methodFirstObject = methodFirstObject;
    }

    // Init [4]
    @PostConstruct
    public void init() {
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroy");
    }

    @Override
    public void setApplicationContext(final ApplicationContext applicationContextParam) throws BeansException {
        // TODO Auto-generated method stub

    }

    @Override
    public void setBeanName(final String nameParam) {
        System.out.println("Bean name : " + nameParam);
    }

}
