package eu.lukas912.carrentalbackend.Service;

import eu.lukas912.carrentalbackend.Model.Car;
import eu.lukas912.carrentalbackend.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetCarService {

    private CarRepository carRepository;
    @Autowired
    public GetCarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Iterable<Car> getAllCars() {
        return carRepository.findAll();
    }
}
