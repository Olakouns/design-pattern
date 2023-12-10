package io.kouns;

public class PayPalCardPayment implements PaymentInterface {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paying " + amount + " using PayPal");
    }
}
