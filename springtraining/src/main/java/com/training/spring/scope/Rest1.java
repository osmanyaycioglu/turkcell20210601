package com.training.spring.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.ApplicationScope;

@RestController
@RequestMapping("/rest1")
@ApplicationScope
public class Rest1 {

    @Autowired
    private MyBean mb;

    @GetMapping("/bean")
    public String getBean() {
        return "rest obj : " + this.toString() + " mybean : " + this.mb.toString();
    }

    @GetMapping("/set")
    public String setBean(@RequestParam("str") final String str,
                          @RequestParam("int") final Integer intVal) {
        this.mb.setStr(str);
        this.mb.setIntVal(intVal);
        return "SUCCESS";
    }


}
