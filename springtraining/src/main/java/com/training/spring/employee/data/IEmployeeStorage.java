package com.training.spring.employee.data;

import com.training.spring.employee.model.internal.EmployeeInternal;

public interface IEmployeeStorage {

    void store(EmployeeInternal employeeParam);

    EmployeeInternal get(String name,
                         String surname);
}
