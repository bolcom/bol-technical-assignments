package com.bol.test.assignment.aggregator;

import com.bol.test.assignment.image.ImageService;
import com.bol.test.assignment.offer.OfferService;
import com.bol.test.assignment.order.OrderService;
import com.bol.test.assignment.product.ProductService;

public class AggregatorService {
    private OrderService orderService;
    private OfferService offerService;
    private ProductService productService;
    private ImageService imageService;

    public AggregatorService(OrderService orderService, OfferService offerService, ProductService productService, ImageService imageService) {
        this.orderService = orderService;
        this.offerService = offerService;
        this.productService = productService;
        this.imageService = imageService;
    }

    public EnrichedOrder enrich(int sellerId) {
        throw new UnsupportedOperationException();

    }
}
