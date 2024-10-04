package disenoYArquitecura.obserbabilidad.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import disenoYArquitecura.obserbabilidad.entities.Customer_order;
import disenoYArquitecura.obserbabilidad.services.customerOrderService;
import java.util.List;

@RestController
public class controlCustomerOrder {

    customerOrderService os1;

    public controlCustomerOrder(customerOrderService os1)
    {
        this.os1=os1;
    }
    
    @GetMapping("/o")
    public List<Customer_order> orders()
    {
        return this.os1.getRepositorio();
    }
}
