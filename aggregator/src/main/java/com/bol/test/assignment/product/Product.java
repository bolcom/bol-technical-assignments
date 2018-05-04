package com.bol.test.assignment.product;


public class Product {
    private int id;
    private String title;

    public Product(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
