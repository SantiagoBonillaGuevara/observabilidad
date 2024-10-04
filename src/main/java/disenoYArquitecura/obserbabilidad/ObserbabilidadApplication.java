package disenoYArquitecura.obserbabilidad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@EntityScan(basePackages = "disenoYArquitecura.obserbabilidad.entities")
@SpringBootApplication
public class ObserbabilidadApplication {
	@GetMapping("/we")
	public String g() {
		return "muy buenas noches perro hpta mlp";
	}

	public static void main(String[] args) {
		SpringApplication.run(ObserbabilidadApplication.class, args);
	}
}
