package disenoYArquitecura.obserbabilidad.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer_order")
public class Customer_order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_order;

    @Column(name = "id_product")
    private Long id_product;

    @Column(name = "id_user")
    private Long id_user;

    public Customer_order()
    {

    }
    public Customer_order(Long id_order, Long id_product, Long id_user) {
        this.id_order = id_order;
        this.id_product = id_product;
        this.id_user = id_user;
    }

    public Long getId_order() {
        return id_order;
    }

    public void setId_order(Long id_order) {
        this.id_order = id_order;
    }

    public Long getId_product() {
        return id_product;
    }

    public void setId_product(Long id_product) {
        this.id_product = id_product;
    }

    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }

    
}
