package ua.edu.ucu.apps.flowerstore.orders;

public abstract class PaperDecorator extends ItemDecorator {

    public PaperDecorator(String description, double price) {
        super(description, price);
    }
    public double getPrice(Item item) {
        return 13.0 + item.getPrice();
    }

    
}
