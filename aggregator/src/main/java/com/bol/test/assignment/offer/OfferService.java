package com.bol.test.assignment.offer;

import com.bol.test.assignment.offer.OfferCondition;

public class OfferService {
    public Offer getOffer(int id) {
        return  new Offer(id, OfferCondition.AS_NEW);
    }
}
