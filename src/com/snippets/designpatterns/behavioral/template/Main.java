package com.snippets.designpatterns.behavioral.template;

public class Main {

    public static void main(String[] args) {
        WebOrder webOrder = new WebOrder(false);
        webOrder.doCheckout();

        StoreOrder storeOrder = new StoreOrder(true);
        storeOrder.doCheckout();
    }
}
