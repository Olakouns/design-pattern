package io.kouns;

public class Main {
    public static void main(String[] args) {
       CreditCardPayment creditCardPayment = new CreditCardPayment();
       PaymentContext paymentContext = new PaymentContext(creditCardPayment);

       paymentContext.processPayment(200);

        DebitCardPayment debitCardPayment = new DebitCardPayment();
        paymentContext.setPaymentInterface(debitCardPayment);
        paymentContext.processPayment(100);
    }
}