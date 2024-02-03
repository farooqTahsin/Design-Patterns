package payment_processing_system.payment_strategy;

public class PayPalPayment implements PaymentStrategy {
    private String email;
    public PayPalPayment(String email) {
        this.email = email;
    }
    @Override
    public void pay(int amount) {
        System.out.println("Paid $" + amount + " via PayPal with email " + email);
    }
}
