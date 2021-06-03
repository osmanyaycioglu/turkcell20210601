package com.training.spring.employee.data;

import org.springframework.data.repository.CrudRepository;

import com.training.spring.employee.model.internal.EmployeeInternal;

public interface IEmployeeDAO extends CrudRepository<EmployeeInternal, Long> {


    EmployeeInternal findByNameAndSurname(String name,
                                          String surname);
}
