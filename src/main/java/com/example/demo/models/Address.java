package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "addressTable")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAddress")
    private Integer idAddress;
    @Column(length = 250,nullable = false)
    private String street;
    @Column(length = 100,nullable = false)
    private String city;
    @Column(name = "zipCode")
    private String zipCode;
    @Column(length = 50,nullable = false)
    private String country;

    public Address(Integer idAddress, String street, String city, String zipCode, String country) {
        this.idAddress = idAddress;
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
        this.country = country;
    }

    public Address() {
    }

    public Integer getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(Integer idAddress) {
        this.idAddress = idAddress;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
