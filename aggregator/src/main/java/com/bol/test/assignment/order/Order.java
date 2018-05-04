package com.bol.test.assignment.order;

public class Order {
    private int id;
    private int offerId;
    private int productId;

    public Order(int id, int offerId, int productId) {
        this.id = id;
        this.offerId = offerId;
        this.productId = productId;
    }

    public int getId() {
        return id;
    }

    public int getOfferId() {
        return offerId;
    }

    public int getProductId() {
        return productId;
    }
}
