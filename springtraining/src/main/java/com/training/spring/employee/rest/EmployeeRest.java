package com.training.spring.employee.rest;

import javax.validation.constraints.NotEmpty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.spring.employee.model.external.Employee;
import com.training.spring.employee.model.internal.EmployeeInternal;
import com.training.spring.employee.service.EmployeeManager;

@RestController
@RequestMapping("/api/v1/employee/provision")
@Validated
public class EmployeeRest {

    @Autowired
    private EmployeeManager em;

    @PostMapping("/add")
    public String add(@Validated @RequestBody final Employee employeeParam) {
        if (employeeParam.getHeight() == 203) {
            throw new IllegalArgumentException("Uzunluk 203 olamaz");
        }
        this.em.add(new EmployeeInternal(employeeParam));
        return "SUCCESS";
    }

    @GetMapping("/get/{xyz}/{abc}")
    public Employee get(@NotEmpty @PathVariable("xyz") final String name,
                        @NotEmpty @PathVariable("abc") final String surname) {
        EmployeeInternal employeeInternalLoc = this.em.get(name,
                                                           surname);
        if (employeeInternalLoc != null) {
            return employeeInternalLoc.convert();
        } else {
            return null;
        }
    }


}
