package at.htlleonding.vehicle.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
@Table(name = "V_VEHICLE")
public class Vehicle {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "V_ID")
    private Long id;

    @Column(name = "V_BRAND", nullable = false)
    private String brand;

    @Column(name = "V_MODEL", nullable = false)
    private String model;

    //region constructors
    public Vehicle() {
    }

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    //endregion

    //region getter and setter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    //endregion


    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
