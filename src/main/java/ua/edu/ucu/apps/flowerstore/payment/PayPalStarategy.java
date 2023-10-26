package ua.edu.ucu.apps.flowerstore.payment;


public class PayPalStarategy implements PaymentStrategy{
    private String email;

    public void PayPalStrategy(String email) {
        this.email = email;
    }

    @Override
    public void pay(double price) {
        System.out.println("Paid " + price + "$ with PayPal using email: " + email);
    }
}
