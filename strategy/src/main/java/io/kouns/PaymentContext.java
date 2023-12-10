package io.kouns;

public class PaymentContext {
    private PaymentInterface paymentInterface;

    public PaymentContext() {
    }

    public PaymentContext(PaymentInterface paymentInterface) {
        this.paymentInterface = paymentInterface;
    }

    public PaymentInterface getPaymentInterface() {
        return paymentInterface;
    }

    public void setPaymentInterface(PaymentInterface paymentInterface) {
        this.paymentInterface = paymentInterface;
    }

    public void processPayment(double amount) {
        paymentInterface.processPayment(amount);
    }
}
