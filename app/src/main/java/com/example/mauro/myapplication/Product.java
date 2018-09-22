package com.example.mauro.myapplication;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long pId;
    private Long barcodeSent;
    private String productName;

    protected Product() {}

    public Long getId() {
        return pId;
    }

    public void setId(Long id) {
        this.pId = id;
    }

    public Long getBarcodeSent() {
        return barcodeSent;
    }

    public void setBarcodeSent(Long barcodeSent) {
        this.barcodeSent = barcodeSent;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Product(Long barcodeSent, String productName) {
        this.barcodeSent = barcodeSent;
        this.productName = productName;
    }

    @Override
    public String toString() {
        return String.format(
                "Product[barcodeSent='%s', productName='%s']",
                barcodeSent, productName);
    }
}
