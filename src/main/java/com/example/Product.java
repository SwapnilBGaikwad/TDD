package com.example;

import java.util.Objects;

class Product {
    private int weight;
    private final int price;

    Product(int weight, int price) {
        this.weight = weight;
        this.price = price;
    }

    int getWeight() {
        return weight;
    }

    int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return weight == product.weight &&
                price == product.price;
    }

    @Override
    public int hashCode() {

        return Objects.hash(weight, price);
    }
}
