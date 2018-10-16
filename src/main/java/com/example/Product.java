package com.example;

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

    public int getPrice() {
        return price;
    }
}
