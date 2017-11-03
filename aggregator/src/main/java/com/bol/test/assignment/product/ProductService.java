package com.bol.test.assignment.product;

public class ProductService {
    public Product getProduct(int id) {
        return new Product(id, "Product title");
    }
}
