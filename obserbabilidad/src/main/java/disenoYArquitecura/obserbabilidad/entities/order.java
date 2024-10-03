package disenoYArquitecura.obserbabilidad.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "order")
public class order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_order;

    @Column(name = "id_product")
    private int id_product;

    @Column(name = "id_user")
    private int id_user;

    public order()
    {

    }
    public order(int id_order, int id_product, int id_user) {
        this.id_order = id_order;
        this.id_product = id_product;
        this.id_user = id_user;
    }

    public int getId_order() {
        return id_order;
    }

    public void setId_order(int id_order) {
        this.id_order = id_order;
    }

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    
}
