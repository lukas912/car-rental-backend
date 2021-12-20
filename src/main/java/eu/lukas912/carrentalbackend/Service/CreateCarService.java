package eu.lukas912.carrentalbackend.Service;

import eu.lukas912.carrentalbackend.Model.Car;
import eu.lukas912.carrentalbackend.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateCarService {

    private CarRepository carRepository;

    @Autowired
    public CreateCarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public void createCars(Iterable<Car> cars) {
        carRepository.saveAll(cars);
    }
}
