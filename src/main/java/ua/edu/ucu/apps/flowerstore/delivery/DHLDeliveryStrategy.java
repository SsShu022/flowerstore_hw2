package ua.edu.ucu.apps.flowerstore.delivery;

import java.util.List;

import ua.edu.ucu.apps.flowerstore.orders.Item;

public class DHLDeliveryStrategy implements DeliveryStrategy {

    @Override
    public void deliver(List<Item> items) {
        System.out.println("Delivering " + items + " via DHL servises");
    }
    
}
