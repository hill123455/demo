package com.hieu.demo.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Address {


    private int number;

    @NotNull
    private String district;

    @NotBlank
    private String city;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
