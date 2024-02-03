package payment_processing_system;

/*
    The Strategy Pattern defines a family of algorithms,
    encapsulates each one, and makes them interchangeable.
    Strategy lets the algorithm vary independently from
    clients that use it.
*/

import payment_processing_system.payment_strategy.CashPayment;
import payment_processing_system.payment_strategy.CreditCardPayment;
import payment_processing_system.payment_strategy.PayPalPayment;
import payment_processing_system.shopping_cart.ShoppingCart;
import java.util.Scanner;

public class PaymentSystem {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        ShoppingCart shoppingCart = new ShoppingCart();
        System.out.println("Select a payment method:");
        System.out.println("1. Credit Card");
        System.out.println("2. PayPal");
        System.out.println("3. Cash");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter credit card number: ");
                String cardNumber = in.next();
                shoppingCart.setPaymentStrategy(new CreditCardPayment(cardNumber));
                break;
            case 2:
                System.out.print("Enter PayPal email: ");
                String email = in.next();
                shoppingCart.setPaymentStrategy(new PayPalPayment(email));
                break;
            case 3:
                shoppingCart.setPaymentStrategy(new CashPayment());
                break;
            default:
                System.out.println("The default payment method is CASH");
        }
        System.out.print("Enter the amount of money to pay: ");
        int amount = in.nextInt();
        shoppingCart.checkout(amount);
    }
}
