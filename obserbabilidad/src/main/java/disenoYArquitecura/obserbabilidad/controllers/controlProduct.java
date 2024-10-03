package disenoYArquitecura.obserbabilidad.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controlProduct {
    
    @GetMapping("/products")
    public String products()
    {
        return "products";
    }

}
