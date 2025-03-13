package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "detailTable")
public class Detail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDetail")
    private Integer idDetail;
    @Column(nullable = false)
    private Integer Amount;
    @Column(length = 10,nullable = false)
    private double subTotal;

    public Detail(Integer idDetail, Integer amount, double subTotal) {
        this.idDetail = idDetail;
        Amount = amount;
        this.subTotal = subTotal;
    }

    public Detail() {
    }

    public Integer getIdDetail() {
        return idDetail;
    }

    public void setIdDetail(Integer idDetail) {
        this.idDetail = idDetail;
    }

    public Integer getAmount() {
        return Amount;
    }

    public void setAmount(Integer amount) {
        Amount = amount;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
}
