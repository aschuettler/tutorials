package com.javadevjournal.tutorials.corejava.java8.optional;

import java.util.Optional;

/**
 * Created by umesh on 6/8/17.
 */
public class OptinalFilterExample {

    public boolean checkIfEligibleForPromotion(Product product) {
        if (product != null && product.getProductPrice() != null
                && product.getProductPrice().doubleValue() > 20.00
                && product.getProductPrice().doubleValue() <= 50) {

            return true;
        }
        return false;
    }

    public boolean checkIfEligibleForPromotionByFilter(Product product) {
        return Optional.ofNullable(product).map(Product::getProductPrice)
                .filter(productPrice->productPrice >20)
                .filter(productPrice->productPrice <=50)
                .isPresent();
    }

}
