package eu.lukas912.carrentalbackend.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
    @Getter @Setter @Id
    private Integer id;
    @Getter @Setter
    private String brand;
    @Getter @Setter
    private String model;
    @Getter @Setter
    private Float weight;
    @Getter @Setter
    private Float price;
}
