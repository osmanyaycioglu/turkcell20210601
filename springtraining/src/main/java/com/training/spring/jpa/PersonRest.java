package com.training.spring.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/person/provision")
public class PersonRest {

    @Autowired
    private PersonDAO perDAO;

    @PostMapping("add")
    public String add(@RequestBody final Person person) {
        this.perDAO.save(person);
        return "SUCCESS";
    }

}
