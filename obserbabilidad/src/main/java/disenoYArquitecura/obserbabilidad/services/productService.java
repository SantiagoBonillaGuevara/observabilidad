package disenoYArquitecura.obserbabilidad.services;

import java.util.List;

import org.springframework.stereotype.Service;

import disenoYArquitecura.obserbabilidad.entities.product;
import disenoYArquitecura.obserbabilidad.repositories.RepositoryProduct;

@Service
public class productService {

    private RepositoryProduct repositorio;

    public productService(RepositoryProduct repositorio){
        this.repositorio=repositorio;
    }

    public List<product> getRepositorio()
    {
        return this.repositorio.findAll();
    }
}
