package com.training.spring.employee.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.training.spring.employee.model.external.Employee;
import com.training.spring.employee.model.internal.EmployeeInternal;
import com.training.spring.employee.service.EmployeeManager;

@RestController
@RequestMapping("/api/v1/employee/provision")
public class EmployeeRest {

    @Autowired
    private EmployeeManager em;

    @PostMapping("/add")
    public void add(@Validated @RequestBody final Employee employeeParam) {
        if (employeeParam.getHeight() == 203) {
            throw new IllegalArgumentException("Uzunluk 203 olamaz");
        }
        this.em.add(new EmployeeInternal(employeeParam));
    }

    @GetMapping("/get/{xyz}/{abc}")
    public Employee get(@PathVariable("xyz") final String name,
                        @PathVariable("abc") final String surname) {
        EmployeeInternal employeeInternalLoc = this.em.get(name,
                                                           surname);
        if (employeeInternalLoc != null) {
            return employeeInternalLoc.convert();
        } else {
            return null;
        }
    }

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleError(final IllegalArgumentException exceptionParam) {
        return "Error oluştu " + exceptionParam.getMessage();
    }

}
