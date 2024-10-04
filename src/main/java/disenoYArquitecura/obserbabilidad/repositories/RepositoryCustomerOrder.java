package disenoYArquitecura.obserbabilidad.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import disenoYArquitecura.obserbabilidad.entities.Customer_order;

@Repository
public interface RepositoryCustomerOrder extends JpaRepository<Customer_order, Long>{
    
}
