package io.kouns;

public class DebitCardPayment implements PaymentInterface {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paying " + amount + " using Debit Card");
    }
}
