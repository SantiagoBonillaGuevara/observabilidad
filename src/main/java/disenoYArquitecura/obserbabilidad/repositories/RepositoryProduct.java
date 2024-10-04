package disenoYArquitecura.obserbabilidad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import disenoYArquitecura.obserbabilidad.entities.Product;

@Repository
public interface RepositoryProduct extends JpaRepository<Product, Long> {

}
