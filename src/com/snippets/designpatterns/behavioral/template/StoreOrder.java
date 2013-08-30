package com.snippets.designpatterns.behavioral.template;

public class StoreOrder extends OrderTemplate {

    public StoreOrder(boolean isGift) {
        this.isGift = isGift;
    }

    @Override
    public void doPayment() {
        System.out.println("Doing web order");
    }

    @Override
    public void doReceipt() {
        System.out.println("Doing web receipt.");
    }
}
