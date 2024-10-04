package disenoYArquitecura.obserbabilidad.services;

import disenoYArquitecura.obserbabilidad.entities.Customer;
import disenoYArquitecura.obserbabilidad.repositories.RepositoryCustomer;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class customerService {

    private RepositoryCustomer repositorio;

    public customerService(RepositoryCustomer repositorio){
        this.repositorio=repositorio;
    }

    public List<Customer> getRepositorio()
    {
        return this.repositorio.findAll();
    }
}
