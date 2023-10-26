package ua.edu.ucu.apps.flowerstore.orders;

import lombok.Getter;

@Getter

public abstract class Item {
    private String description;
    private double price;

    public Item(String description, double price) {
        this.description = description;
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
}
