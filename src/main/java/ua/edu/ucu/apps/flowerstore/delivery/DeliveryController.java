package ua.edu.ucu.apps.flowerstore.delivery;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {
    @GetMapping("/set")
    public boolean getDelivery(Delivery delivery) {
        return  true;
        
    }

}
