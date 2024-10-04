package disenoYArquitecura.obserbabilidad.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import disenoYArquitecura.obserbabilidad.entities.Customer;
import disenoYArquitecura.obserbabilidad.services.customerService;

@RestController
public class controlCustomer {

    
    customerService us1;

    public controlCustomer(customerService us1)
    {
        this.us1= us1;
    }

    @GetMapping("/c")
    public List<Customer> customers()
    {
        return this.us1.getRepositorio();
    }

}
