package com.training.spring.employee.data;

import org.springframework.beans.factory.annotation.Autowired;

import com.training.spring.employee.model.internal.EmployeeInternal;

public class DBEmployeeStorageManager implements IEmployeeStorage {

    @Autowired
    private IEmployeeDAO employeeDAO;

    @Override
    public void store(final EmployeeInternal employeeParam) {
        this.employeeDAO.save(employeeParam);

    }

    @Override
    public EmployeeInternal get(final String nameParam,
                                final String surnameParam) {
        return this.employeeDAO.findByNameAndSurname(nameParam,
                                                     surnameParam);
    }

}
