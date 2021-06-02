package com.training.spring.employee.model.internal;

import java.time.LocalDate;

import com.training.spring.employee.model.external.Employee;
import com.training.spring.rest.EGender;

public class EmployeeInternal {

    private String    name;
    private String    surname;
    private int       height;
    private LocalDate birthdate;
    private EGender   gender;


    public EmployeeInternal() {
    }

    public EmployeeInternal(final Employee employeeParam) {
        this.name = employeeParam.getName();
        this.surname = employeeParam.getSurname();
        this.height = employeeParam.getHeight();
        this.birthdate = employeeParam.getBirthdate();
        this.gender = employeeParam.getGender();
    }

    public Employee convert() {
        Employee employeeParam = new Employee();
        employeeParam.setName(this.name);
        employeeParam.setSurname(this.surname);
        employeeParam.setHeight(this.height);
        employeeParam.setBirthdate(this.birthdate);
        employeeParam.setGender(this.gender);
        return employeeParam;

    }

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(final String surnameParam) {
        this.surname = surnameParam;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(final int heightParam) {
        this.height = heightParam;
    }

    public LocalDate getBirthdate() {
        return this.birthdate;
    }

    public void setBirthdate(final LocalDate birthdateParam) {
        this.birthdate = birthdateParam;
    }

    public EGender getGender() {
        return this.gender;
    }

    public void setGender(final EGender genderParam) {
        this.gender = genderParam;
    }

    @Override
    public String toString() {
        StringBuilder builderLoc = new StringBuilder();
        builderLoc.append("Employee [name=");
        builderLoc.append(this.name);
        builderLoc.append(", surname=");
        builderLoc.append(this.surname);
        builderLoc.append(", height=");
        builderLoc.append(this.height);
        builderLoc.append(", birthdate=");
        builderLoc.append(this.birthdate);
        builderLoc.append(", gender=");
        builderLoc.append(this.gender);
        builderLoc.append("]");
        return builderLoc.toString();
    }

}
