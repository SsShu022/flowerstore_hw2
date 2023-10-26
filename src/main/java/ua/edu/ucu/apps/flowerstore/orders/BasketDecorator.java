package ua.edu.ucu.apps.flowerstore.orders;

public abstract class BasketDecorator extends ItemDecorator{

    public BasketDecorator(String description, double price) {
        super(description, price);
    }
    public double getPrice(Item item){
        return 4 + item.getPrice();
    }
}
