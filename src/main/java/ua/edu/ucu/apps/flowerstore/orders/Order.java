package ua.edu.ucu.apps.flowerstore.orders;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import ua.edu.ucu.apps.flowerstore.delivery.DeliveryStrategy;
import ua.edu.ucu.apps.flowerstore.payment.PaymentStrategy;
@Getter

public class Order {
    private List<Item> items;
    private DeliveryStrategy deliveryStrategy;
    private PaymentStrategy paymentStrategy;

    public Order() {
        items = new ArrayList<>();
    }

    public void setDeliveryStrategy(DeliveryStrategy deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public double calculateTotalPrice() {
        double totalPrice = 0.0;
        for (Item item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public void processOrder() {
        double totalPrice = calculateTotalPrice();

        if (deliveryStrategy != null) {
            deliveryStrategy.deliver((List<Item>) this);
        }

        if (paymentStrategy != null) {
            paymentStrategy.pay(totalPrice);
        }
    }

}

