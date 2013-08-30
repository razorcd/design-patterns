package com.snippets.designpatterns.behavioral.template;


/**
 * Template class for creating order classes.
 */
public abstract class OrderTemplate {

    protected boolean isGift;

    public abstract void doPayment();
    public abstract void doReceipt();

    public boolean isGift() {
        return isGift;
    }

    public final void doCheckout() {
        doPayment();
        doReceipt();
        System.out.println("Checkout complete.");
    }
}
