package ua.edu.ucu.apps.flowerstore.delivery;

import java.util.List;

import ua.edu.ucu.apps.flowerstore.orders.Item;

public class Delivery {
    private DeliveryStrategy deliveryStrategy;

    public Delivery(DeliveryStrategy deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
    }

    public void setDeliveryStrategy(DeliveryStrategy deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
    }

    public void deliverItem(List<Item> items) {
        deliveryStrategy.deliver(items);
    }
}
