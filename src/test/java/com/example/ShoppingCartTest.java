package com.example;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;

public class ShoppingCartTest {
    @Test
    public void addProductShouldAddProductInCart() {
        ShoppingCart cart = new ShoppingCart();
        final Product product = new Product();

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
        Product product = new Product(10);
        boolean isAdded = cart.addProduct(product);

        Assert.assertThat(isAdded, equalTo(true));

        product = new Product(10);
        isAdded = cart.addProduct(product);
        Assert.assertThat(isAdded, equalTo(false));
    }
}