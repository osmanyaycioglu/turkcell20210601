package com.training.spring.language.v2;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "hello")
public class LanguageProperties {

    private int                    language;
    private String                 test;
    private double                 amount;
    private List<String>           isimler;
    private Map<String, Integer>   kelimeSayilari;
    private InnerProp              innerProp;
    private Map<String, InnerProp> serverMap;


    public int getLanguage() {
        return this.language;
    }


    public void setLanguage(final int languageParam) {
        this.language = languageParam;
    }


    public String getTest() {
        return this.test;
    }


    public void setTest(final String testParam) {
        this.test = testParam;
    }


    public double getAmount() {
        return this.amount;
    }


    public void setAmount(final double amountParam) {
        this.amount = amountParam;
    }


    public List<String> getIsimler() {
        return this.isimler;
    }


    public void setIsimler(final List<String> isimlerParam) {
        this.isimler = isimlerParam;
    }


    public Map<String, Integer> getKelimeSayilari() {
        return this.kelimeSayilari;
    }


    public void setKelimeSayilari(final Map<String, Integer> kelimeSayilariParam) {
        this.kelimeSayilari = kelimeSayilariParam;
    }


    public InnerProp getInnerProp() {
        return this.innerProp;
    }


    public void setInnerProp(final InnerProp innerPropParam) {
        this.innerProp = innerPropParam;
    }


    public Map<String, InnerProp> getServerMap() {
        return this.serverMap;
    }


    public void setServerMap(final Map<String, InnerProp> serverMapParam) {
        this.serverMap = serverMapParam;
    }


}
