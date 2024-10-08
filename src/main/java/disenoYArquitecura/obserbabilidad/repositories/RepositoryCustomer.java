package disenoYArquitecura.obserbabilidad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import disenoYArquitecura.obserbabilidad.entities.Customer;

@Repository
public interface RepositoryCustomer extends JpaRepository<Customer, Long> {

}
