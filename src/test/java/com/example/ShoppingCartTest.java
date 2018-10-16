package com.example;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;

public class ShoppingCartTest {
    @Test
    public void addProductShouldAddProductInCart() {
        ShoppingCart cart = new ShoppingCart();
        final Product product = new Product(0, 0);

        boolean isAdded = cart.addProduct(product);

        Assert.assertThat(isAdded, equalTo(true));
    }

    @Test
    public void addProductShouldNotAddNullProduct() {
        ShoppingCart cart = new ShoppingCart();

        boolean isAdded = cart.addProduct(null);

        Assert.assertThat(isAdded, equalTo(false));

    }

    @Test
    public void addProductShouldReturnFalseIfCartSizeIsExcesses() {
        ShoppingCart cart = new ShoppingCart();
        Product product = new Product(10, 0);
        boolean isAdded = cart.addProduct(product);

        Assert.assertThat(isAdded, equalTo(true));

        product = new Product(10, 0);
        isAdded = cart.addProduct(product);
        Assert.assertThat(isAdded, equalTo(false));
    }

    @Test
    public void totalPriceShouldReturnTotalPriceOfAddedProducts() {
        ShoppingCart cart = new ShoppingCart();
        Product product = new Product(5, 100);
        cart.addProduct(product);
        product = new Product(5, 400);
        cart.addProduct(product);
        int totalPrice = cart.totalPrice();

        Assert.assertThat(totalPrice, equalTo(500));
    }

    @Test
    public void countShouldReturnNoOfProductsInCart() {
        ShoppingCart cart = new ShoppingCart();
        Product product = new Product(5, 100);
        cart.addProduct(product);
        product = new Product(5, 400);
        cart.addProduct(product);
        int count = cart.countProducts();

        Assert.assertThat(count, equalTo(2));
    }

    @Test
    public void countShouldReturnZeroIfCartIsEmpty() {
        ShoppingCart cart = new ShoppingCart();
        int count = cart.countProducts();

        Assert.assertThat(count, equalTo(0));
    }
}