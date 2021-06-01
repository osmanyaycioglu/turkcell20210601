package com.training.spring.language.v2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class LanguageConfig {

    @Autowired
    private Environment        env;

    @Value("${hello.language}")
    private int                helloLanguage;

    @Autowired
    private LanguageProperties lp;

    @Bean
    @Qualifier("helloV2")
    public IHello helloCreation() {
        switch (this.lp.getLanguage()) {
            case 1:
                return new HelloENG();
            case 2:
                return new HelloTR();
            case 3:
                return new HelloESP();
            default:
                return new HelloENG();
        }
    }

    //    @Bean
    //    @Qualifier("helloV2")
    //    public IHello helloCreation() {
    //        switch (this.helloLanguage) {
    //            case 1:
    //                return new HelloENG();
    //            case 2:
    //                return new HelloTR();
    //            case 3:
    //                return new HelloESP();
    //            default:
    //                return new HelloENG();
    //        }
    //    }

    //    @Bean
    //    @Qualifier("helloV2")
    //    public IHello helloCreation() {
    //        String propertyLoc = this.env.getProperty("hello.language");
    //        int parseIntLoc = Integer.parseInt(propertyLoc);
    //        switch (parseIntLoc) {
    //            case 1:
    //                return new HelloENG();
    //            case 2:
    //                return new HelloTR();
    //            case 3:
    //                return new HelloESP();
    //            default:
    //                return new HelloENG();
    //        }
    //    }

    @Bean
    @Qualifier("v2")
    public Language languageCreation() {
        return new Language();
    }

}
