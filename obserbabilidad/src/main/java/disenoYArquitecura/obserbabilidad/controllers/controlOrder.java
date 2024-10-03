package disenoYArquitecura.obserbabilidad.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controlOrder {

    @GetMapping("/orders")
    public String orders()
    {
        return "orders";
    }
}
