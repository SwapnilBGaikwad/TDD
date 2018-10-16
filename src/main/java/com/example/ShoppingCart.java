package com.example;

import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private int weight = 0;
    private List<Product> products;

    ShoppingCart() {
        products = new ArrayList<>();
    }

    boolean addProduct(Product product) {
        if (product == null) {
            return false;
        }
        int newWeight = weight + product.getWeight();
        if (newWeight > 15) {
            return false;
        } else {
            weight = newWeight;
            products.add(product);
            return true;
        }
    }

    int totalPrice() {
        int total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    int countProducts() {
        return products.size();
    }

    boolean contains(Product product) {
        return products.contains(product);
    }
}
