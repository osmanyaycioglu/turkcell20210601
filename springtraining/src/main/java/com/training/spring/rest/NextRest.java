package com.training.spring.rest;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.spring.employee.model.external.Employee;

@RestController
@RequestMapping("/next")
public class NextRest {

    @GetMapping("/hello/abc/{isim}/xyz/{soy}")
    public String hello(@PathVariable("isim") final String name,
                        @PathVariable("soy") final String surname) {
        return "Hello " + name + " " + surname;
    }

    @GetMapping("/hello2")
    public String hello2(@RequestParam("isim") final String name,
                         @RequestParam("soy") final String surname) {
        return "Hello 2 " + name + " " + surname;
    }

    @GetMapping("/hello3/{isim}")
    public String hello3(@PathVariable("isim") final String name,
                         @RequestParam("soy") final String surname) {
        return "Hello 3 " + name + " " + surname;
    }

    @GetMapping("/hello4/{komut}")
    public ResponseEntity<?> hello4(@PathVariable("komut") final String komut,
                                    final HttpServletRequest requestParam) {
        switch (komut) {
            case "al":
                System.out.println("al");
                break;
            case "ver":
                System.out.println("ver");
                break;

            default:
                break;
        }
        return ResponseEntity.status(253)
                             .body("test");
    }

    @GetMapping("/hello5")
    public String hello5(@RequestHeader("isim") final String name,
                         @RequestHeader("soy") final String surname) {
        return "Hello 5 " + name + " " + surname;
    }

    @PostMapping("/hello6")
    public String hello(@RequestBody final Employee employeeParam) {
        return employeeParam.toString();
    }

    @PostMapping("/hello7")
    public Employee hello7(@RequestBody final Employee employeeParam) {
        return employeeParam;
    }


}
