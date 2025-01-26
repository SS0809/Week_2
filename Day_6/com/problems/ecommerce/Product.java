package com.problems.ecommerce;

public abstract class Product {
    //    Create an abstract class Product with fields like productId,
    //    name, and price, and an abstract method calculateDiscount().
    int productId;
    String name ;
    int price;
    abstract double calculateDiscount();
}
