package disenoYArquitecura.obserbabilidad.services;

import disenoYArquitecura.obserbabilidad.entities.Customer_order;
import disenoYArquitecura.obserbabilidad.repositories.RepositoryCustomerOrder;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class customerOrderService {

    private RepositoryCustomerOrder repositorio;

    public customerOrderService(RepositoryCustomerOrder repositorio)
    {
        this.repositorio=repositorio;
    }
    
    public List<Customer_order> getRepositorio()
    {
        return this.repositorio.findAll();
    }
}
