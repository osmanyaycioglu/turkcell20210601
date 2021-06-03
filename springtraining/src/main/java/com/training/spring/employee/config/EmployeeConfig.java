package com.training.spring.employee.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.training.spring.employee.data.DBEmployeeStorageManager;
import com.training.spring.employee.data.IEmployeeStorage;
import com.training.spring.employee.service.EmployeeManager;

@Configuration
public class EmployeeConfig {


    @Bean
    public IEmployeeStorage employeeStorage() {
        return new DBEmployeeStorageManager();
    }

    @Bean
    public EmployeeManager employeeManager() {
        return new EmployeeManager();
    }

}
