package com.training.spring.employee.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.training.spring.employee.data.IEmployeeStorage;
import com.training.spring.employee.model.internal.EmployeeInternal;

public class EmployeeManager {

    @Autowired
    private IEmployeeStorage employeeStorage;

    public void add(final EmployeeInternal employeeParam) {
        this.employeeStorage.store(employeeParam);
    }

    public EmployeeInternal get(final String name,
                                final String surname) {
        return this.employeeStorage.get(name,
                                        surname);
    }

}
