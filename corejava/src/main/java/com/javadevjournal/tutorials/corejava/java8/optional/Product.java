package com.javadevjournal.tutorials.corejava.java8.optional;

/**
 * Created by umesh on 6/8/17.
 */
public class Product {

    private Double productPrice;

    public Product(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {

        this.productPrice = productPrice;
    }
}
