package eu.lukas912.carrentalbackend.Repository;

import eu.lukas912.carrentalbackend.Model.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends CrudRepository<Car, Integer> {
}
