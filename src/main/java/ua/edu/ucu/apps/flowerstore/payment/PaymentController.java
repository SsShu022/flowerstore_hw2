package ua.edu.ucu.apps.flowerstore.payment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps.flowerstore.orders.Item;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {
    private PaymentStrategy payment;

    @GetMapping("/pay")
    public String getPayment(PaymentStrategy payment) {
        return "success";
        
    }
    
}
