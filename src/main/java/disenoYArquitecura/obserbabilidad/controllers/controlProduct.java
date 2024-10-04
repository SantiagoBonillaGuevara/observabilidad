package disenoYArquitecura.obserbabilidad.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import disenoYArquitecura.obserbabilidad.entities.Product;
import disenoYArquitecura.obserbabilidad.services.productService;
import java.util.List;

@RestController
public class controlProduct {
    
    productService ps1;

    public controlProduct(productService ps1)
    {
        this.ps1= ps1;
    }
    @GetMapping("/p")
    public List<Product> products()
    {
        return this.ps1.getRepositorio();
    }

}
