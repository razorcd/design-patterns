package com.snippets.designpatterns.behavioral.template;

public class WebOrder extends OrderTemplate {

    public WebOrder(boolean isGift) {
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
