package com.example.demo.models;
import jakarta.persistence.*;

@Entity
@Table (name = "restaurantTable")
public class Store {
    @Id
    @GeneratedValue
    @Column(name = "idRestaurant")
    private Integer idRestaurant;
    @Column(length = 100,nullable = false)
    private String name;
    @Column(length = 250,nullable = false)
    private String address;
    @Column(length = 20,nullable = false)
    private String phone;
    @Column(length = 50)
    private String category;

    public Store(Integer idRestaurant, String name, String address, String phone, String category) {
        this.idRestaurant = idRestaurant;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.category = category;
    }

    public Store() {
    }

    public Integer getIdRestaurant() {
        return idRestaurant;
    }

    public void setIdRestaurant(Integer idRestaurant) {
        this.idRestaurant = idRestaurant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
