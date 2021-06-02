package com.training.spring.employee.model.external;

import java.time.LocalDate;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import com.training.spring.rest.EGender;

public class Employee {

    @NotEmpty
    @Size(min = 2, max = 20, message = "İsim 2 ile 20 arasında olmalı")
    private String    name;
    @NotEmpty
    @Size(min = 2, max = 30)
    private String    surname;
    @Min(100)
    @Max(300)
    private int       height;
    @NotNull
    @Past
    private LocalDate birthdate;
    @NotNull
    private EGender   gender;

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
