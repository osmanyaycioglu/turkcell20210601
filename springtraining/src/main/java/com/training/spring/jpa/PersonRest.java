package com.training.spring.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
        person.getAddress()
              .setPerson(person);
        List<Phone> phonesLoc = person.getPhones();
        for (Phone phoneLoc : phonesLoc) {
            phoneLoc.setPerson(person);
        }
        this.perDAO.save(person);
        return "SUCCESS";
    }

    @PostMapping("update")
    public String update(@RequestBody final Person person) {
        if (person.getPersonId() == null) {
            throw new IllegalStateException("person id null olamaz");
        }
        this.perDAO.save(person);
        return "SUCCESS";
    }

    @GetMapping("/get/{pid}")
    public Person get(@PathVariable("pid") final Long personId) {
        return this.perDAO.findById(personId)
                          .orElse(null);
    }

    @GetMapping("/getByName/{personName}")
    public List<Person> get(@PathVariable("personName") final String personName) {
        return this.perDAO.findByName(personName);
    }

    @GetMapping("/remove/{personId}")
    public String remove(@PathVariable("personId") final Long personId) {
        this.perDAO.deleteById(personId);
        return "REMOVED";
    }

}
