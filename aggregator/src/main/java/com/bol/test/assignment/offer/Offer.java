package com.bol.test.assignment.offer;


public class Offer {
    private int id;
    private OfferCondition condition;

    public Offer(int id, OfferCondition condition) {
        this.id = id;
        this.condition = condition;
    }

    public int getId() {
        return id;
    }

    public OfferCondition getCondition() {
        return condition;
    }
}
