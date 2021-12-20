package eu.lukas912.carrentalbackend.Controller;

import eu.lukas912.carrentalbackend.Model.Car;
import eu.lukas912.carrentalbackend.Service.GetCarService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    private GetCarService getCarService;

    @Autowired
    public CarController(GetCarService getCarService) {
        this.getCarService = getCarService;
    }

    @GetMapping(path = "/cars")
    public Iterable<Car> getCars() {
        return getCarService.getAllCars();
    }
}
