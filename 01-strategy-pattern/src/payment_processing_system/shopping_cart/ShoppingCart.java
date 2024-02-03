package payment_processing_system.shopping_cart;

import payment_processing_system.payment_strategy.CashPayment;
import payment_processing_system.payment_strategy.PaymentStrategy;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;
    public ShoppingCart() {
        paymentStrategy = new CashPayment();
    }
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void checkout(int amount) {
        paymentStrategy.pay(amount);
    }
}
