package com.bol.test.assignment.aggregator;

import com.bol.test.assignment.offer.OfferCondition;

public class EnrichedOrder {
    private int id;
    private int offerId;
    private OfferCondition offerCondition;
    private int productId;
    private String productTitle;

    public EnrichedOrder(int id, int offerId, OfferCondition offerCondition, int productId, String productTitle) {
        this.id = id;
        this.offerId = offerId;
        this.offerCondition = offerCondition;
        this.productId = productId;
        this.productTitle = productTitle;
    }

    public int getId() {
        return id;
    }

    public int getOfferId() {
        return offerId;
    }

    public OfferCondition getOfferCondition() {
        return offerCondition;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductTitle() {
        return productTitle;
    }
}
