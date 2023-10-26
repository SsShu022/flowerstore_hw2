package ua.edu.ucu.apps.flowerstore.orders;

public abstract class ItemDecorator extends Item {
    public ItemDecorator(String description, double price) {
        super(description, price);
    }

    public abstract String getDescription(); // Abstract method to be implemented by concrete decorators
}
