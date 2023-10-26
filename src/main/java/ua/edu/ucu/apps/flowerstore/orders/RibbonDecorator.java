package ua.edu.ucu.apps.flowerstore.orders;

public abstract class RibbonDecorator extends ItemDecorator {

    public RibbonDecorator(String description, double price) {
        super(description, price);
    }
    public double getPrice(Item item) {
        return 40 + item.getPrice();
    }
    
}
