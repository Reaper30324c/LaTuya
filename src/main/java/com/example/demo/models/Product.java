package com.example.demo.models;
import jakarta.persistence.*;

@Entity
@Table(name = "productTable")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProduct")
    private Integer idProduct;
    @Column(length = 100,nullable = false)
    private String name;
    @Column(length = 10,nullable = false)
    private double price;
    @Column(nullable = false)
    private String description;

    public Product(Integer idProduct, Integer idRestaurant, String name, double price, String description) {
        this.idProduct = idProduct;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public Product() {
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
