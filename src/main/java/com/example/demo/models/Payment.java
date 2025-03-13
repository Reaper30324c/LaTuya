package com.example.demo.models;
import com.example.demo.helper.enums.PaymentEnum;
import com.example.demo.helper.enums.PaymentStatusEnum;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "paymentTable")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPayment")
    private Integer idPayment;
    @Column()
    private PaymentEnum paymentMode;
    @Column()
    private LocalDate payDate;
    @Column()
    private PaymentStatusEnum paymentStatus;

    public Payment(Integer idPayment, PaymentEnum paymentMode, LocalDate payDate, PaymentStatusEnum paymentStatus) {
        this.idPayment = idPayment;
        this.paymentMode = paymentMode;
        this.payDate = payDate;
        this.paymentStatus = paymentStatus;
    }

    public Payment() {
    }

    public Integer getIdPayment() {
        return idPayment;
    }

    public void setIdPayment(Integer idPayment) {
        this.idPayment = idPayment;
    }

    public PaymentEnum getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentEnum paymentMode) {
        this.paymentMode = paymentMode;
    }

    public LocalDate getPayDate() {
        return payDate;
    }

    public void setPayDate(LocalDate payDate) {
        this.payDate = payDate;
    }

    public PaymentStatusEnum getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatusEnum paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
