package com.example.demo.models;
import jakarta.persistence.*;

@Entity
@Table(name = "deliveryManTable")
public class Deliveryman {
    @Id
    @GeneratedValue
    @Column(name = "idDeliveryMan")
    private Integer idDeliveryman;
    @Column(length = 100,nullable = false)
    private String name;
    @Column(length = 20,nullable = false)
    private String phone;
    @Column(name = "email", length = 150, unique = true, nullable = false)
    private String email;
    @Column(length = 50,nullable = false)
    private String vehicle;

    public Deliveryman(Integer idDeliveryman, String name, String phone, String email, String vehicle) {
        this.idDeliveryman = idDeliveryman;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.vehicle = vehicle;
    }

    public Deliveryman() {
    }

    public Integer getIdDeliveryman() {
        return idDeliveryman;
    }

    public void setIdDeliveryman(Integer idDeliveryman) {
        this.idDeliveryman = idDeliveryman;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }
}
