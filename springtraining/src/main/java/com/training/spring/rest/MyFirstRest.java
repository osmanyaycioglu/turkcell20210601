package com.training.spring.rest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class MyFirstRest {

    @GetMapping("/hello1")
    public String hello() {
        return "Hello world 1";
    }

    @PostMapping("/hello2")
    public String hello2() {
        return "Hello world 2";
    }

    @PostMapping("/hello3")
    public String hello3a() {
        return "Hello world 3a";
    }

    @PutMapping("/hello3")
    public String hello3() {
        return "Hello world 3";
    }

    @PatchMapping("/hello4")
    public String hello4() {
        return "Hello world 4";
    }

    @DeleteMapping("/hello5")
    public String hello5() {
        return "Hello world 5";
    }

}
