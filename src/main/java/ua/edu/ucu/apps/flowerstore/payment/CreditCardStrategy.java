package ua.edu.ucu.apps.flowerstore.payment;

public class CreditCardStrategy implements PaymentStrategy{
    private String cardNumber;
    private String cardDue;
    private String cardHolder;

    public void CardPaymentStrategy(String cardNumber, String cardDue, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardDue = cardDue;
        this.cardHolder = cardHolder;
    }

    @Override
    public void pay(double price) {
        System.out.println(price + " will be paid with Card ************" + cardNumber.substring(cardNumber.length() - 4));
    }

}
