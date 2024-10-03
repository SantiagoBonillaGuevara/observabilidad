package disenoYArquitecura.obserbabilidad.services;

import disenoYArquitecura.obserbabilidad.entities.user;
import disenoYArquitecura.obserbabilidad.repositories.RepositoryUser;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService {

    private RepositoryUser repositorio;

    public userService(RepositoryUser repositorio){
        this.repositorio=repositorio;
    }

    public List<user> getRepositorio()
    {
        return this.repositorio.findAll();
    }
}
