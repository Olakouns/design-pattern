package io.kouns;

public class CreditCardPayment implements PaymentInterface {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paying " + amount + " using Credit Card");
    }
}
