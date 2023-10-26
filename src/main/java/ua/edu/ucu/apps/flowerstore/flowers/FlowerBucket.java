package ua.edu.ucu.apps.flowerstore.flowers;

import java.util.ArrayList;
import java.util.List;

import ua.edu.ucu.apps.flowerstore.orders.Item;

public class FlowerBucket extends Item {

    public FlowerBucket(String description, double price) {
        super(description, price);    }

    private List<FlowerPack> flowerPacks = new ArrayList<>();

    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack: flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }

    public void addFlowerPack(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }
}
