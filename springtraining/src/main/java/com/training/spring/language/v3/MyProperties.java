package com.training.spring.language.v3;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "language")
public class MyProperties {


    private int            laguageIndex;
    private List<LangProp> langProps;


    public List<LangProp> getLangProps() {
        return this.langProps;
    }


    public void setLangProps(final List<LangProp> langPropsParam) {
        this.langProps = langPropsParam;
    }


    public int getLaguageIndex() {
        return this.laguageIndex;
    }


    public void setLaguageIndex(final int laguageIndexParam) {
        this.laguageIndex = laguageIndexParam;
    }


}
