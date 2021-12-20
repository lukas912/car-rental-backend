package eu.lukas912.carrentalbackend.Config;

import com.google.gson.Gson;
import eu.lukas912.carrentalbackend.Model.Car;
import eu.lukas912.carrentalbackend.Service.CreateCarService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@Configuration
public class CarStartupConfig {
    @Bean
    CommandLineRunner commandLineRunner(CreateCarService createCarService) {

        return args -> {
            //read cars from json

            try {
                Gson gson = new Gson();

                Reader reader = Files.newBufferedReader(Paths.get("src/main/java/cars-mock.json"));

                // convert JSON file to map
                Car[] cars = gson.fromJson(reader, Car[].class);

                createCarService.createCars(List.of(cars));
            }

            catch (Exception e) {
                throw new Exception("Cannot read json file");
            }


        };
    }
}
