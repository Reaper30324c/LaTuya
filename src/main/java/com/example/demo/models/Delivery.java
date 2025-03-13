package com.example.demo.models;
import com.example.demo.helper.enums.DeliveryEnum;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "deliveryTable")
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDelivery")
    private Integer idDelivery;
    @Column()
    private LocalDate deliveryDate;
    @Column
    private DeliveryEnum deliveryStatus;

    public Delivery(Integer idDelivery, LocalDate deliveryDate, DeliveryEnum deliveryStatus) {
        this.idDelivery = idDelivery;
        this.deliveryDate = deliveryDate;
        this.deliveryStatus = deliveryStatus;
    }

    public Delivery() {
    }

    public Integer getIdDelivery() {
        return idDelivery;
    }

    public void setIdDelivery(Integer idDelivery) {
        this.idDelivery = idDelivery;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public DeliveryEnum getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(DeliveryEnum deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }
}
