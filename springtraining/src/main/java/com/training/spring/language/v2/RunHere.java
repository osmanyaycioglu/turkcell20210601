package com.training.spring.language.v2;

import java.lang.reflect.Field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RunHere implements CommandLineRunner {

    @Autowired
    // @Qualifier("v2")
    @LanguageV2
    private Language lang;

    private int      test;

    @Override
    public void run(final String... argsParam) throws Exception {
        System.out.println("v2 çalışıyor");
        this.lang.hello();
        Class<RunHere> gd = RunHere.class;

        Field[] declaredFieldsLoc = gd.getDeclaredFields();
        for (Field fieldLoc : declaredFieldsLoc) {
            LanguageV2 annotationLoc = fieldLoc.getAnnotation(LanguageV2.class);
            if (annotationLoc != null) {
                System.out.println("bu field : " + fieldLoc.getName() + " LanguageV2 barındırıyor.");
            } else {
                System.out.println("bu field : " + fieldLoc.getName() + " yok");
            }
        }
    }

}
