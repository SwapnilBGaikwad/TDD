package com.example;

class ShoppingCart {
    private int weight = 0;

    boolean addProduct(Product product) {
        if (product == null) {
            return false;
        }
        int newWeight = weight + product.getWeight();
        if (newWeight > 15) {
            return false;
        } else {
            weight = newWeight;
            return true;
        }
    }
}
