package eu.lukas912.carrentalbackend.Controller;

import eu.lukas912.carrentalbackend.Model.Car;
import eu.lukas912.carrentalbackend.Service.GetCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@CrossOrigin
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

    @GetMapping(path="/car/{id}")
    public Optional<Car> getCarById(@PathVariable Integer id) {
        return getCarService.getCarById(id);
    }

}
