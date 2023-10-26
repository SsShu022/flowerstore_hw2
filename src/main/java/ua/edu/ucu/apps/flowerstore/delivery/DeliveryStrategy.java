package ua.edu.ucu.apps.flowerstore.delivery;

import java.util.List;

import ua.edu.ucu.apps.flowerstore.orders.Item;

public interface DeliveryStrategy {
    void deliver(List<Item> items);
}
