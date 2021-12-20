package eu.lukas912.carrentalbackend.Model;

import lombok.Getter;
import lombok.Setter;

public class Car {
    @Getter @Setter
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
