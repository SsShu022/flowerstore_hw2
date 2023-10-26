package ua.edu.ucu.apps.flowerstore.flowers;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@AllArgsConstructor
public class Flower{

    public Flower(Flower flower) {
    }
    private double sepalLength;
    private double price;
    private FlowerColor color;

    
}
