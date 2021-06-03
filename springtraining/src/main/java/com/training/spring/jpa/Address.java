package com.training.spring.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Address {

    @Id
    @GeneratedValue
    @JsonIgnore
    private Long   addressId;
    private String city;
    private String district;

    @JsonIgnore
    @XmlTransient
    @OneToOne
    private Person person;

    public String getCity() {
        return this.city;
    }

    public void setCity(final String cityParam) {
        this.city = cityParam;
    }

    public String getDistrict() {
        return this.district;
    }

    public void setDistrict(final String districtParam) {
        this.district = districtParam;
    }

    public Long getAddressId() {
        return this.addressId;
    }

    public void setAddressId(final Long addressIdParam) {
        this.addressId = addressIdParam;
    }

    public Person getPerson() {
        return this.person;
    }

    public void setPerson(final Person personParam) {
        this.person = personParam;
    }


}
