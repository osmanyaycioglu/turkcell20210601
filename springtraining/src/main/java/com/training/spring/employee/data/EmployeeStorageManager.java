package com.training.spring.employee.data;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.training.spring.employee.model.internal.EmployeeInternal;

public class EmployeeStorageManager implements IEmployeeStorage {

    private final Map<String, EmployeeInternal> employeeMap = new ConcurrentHashMap<>();

    @Override
    public void store(final EmployeeInternal employeeParam) {
        this.employeeMap.put(employeeParam.getName() + "_" + employeeParam.getSurname(),
                             employeeParam);
    }

    @Override
    public EmployeeInternal get(final String nameParam,
                                final String surnameParam) {
        return this.employeeMap.get(nameParam + "_" + surnameParam);
    }

}
