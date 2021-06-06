package org.pingpong.restjson;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;


@Entity
@Table(name = "Encargos")
public class Encargo extends PanacheEntityBase{

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ord_id")
	private Long id;

    @OneToOne
    @JoinColumn(name = "fruit_name")
    private Fruit fruit;

    @OneToOne
    @JoinColumn(name = "farmer_name")
    private Farmer farmer;

    public Encargo() {
    }

    public Fruit getFruit() {
        return fruit;
    }

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }

    public Farmer getFarmer() {
        return farmer;
    }

    public void setFarmer(Farmer farmer) {
        this.farmer = farmer;
    }

}
