package disenoYArquitecura.obserbabilidad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import disenoYArquitecura.obserbabilidad.entities.user;

@Repository
public interface RepositoryUser extends JpaRepository<user, Long> {

}
