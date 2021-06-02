package com.training.spring.language.v3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class LanguageConfigV3 {

    @Autowired
    private MyProperties lp;

    @Bean
    @Qualifier("helloV3")
    public IHello helloCreation3() {
        List<LangProp> langPropsLoc = this.lp.getLangProps();
        try {
            LangProp langPropLoc = langPropsLoc.get(this.lp.getLaguageIndex());
            System.out.println("Language Creation -----> shortName : " + langPropLoc.getShortName());
            System.out.println("Language Creation -----> Name : " + langPropLoc.getName());
            System.out.println("Language Creation -----> Desc : " + langPropLoc.getDesc());
            Class<?> forNameLoc = Class.forName(langPropLoc.getClassName());
            return (IHello) forNameLoc.newInstance();
        } catch (Exception eLoc) {
            return new HelloENG();
        }
    }

    @Bean
    @Qualifier("v3")
    public Language languageCreation3() {
        return new Language();
    }
}
