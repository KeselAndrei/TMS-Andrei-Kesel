package by.home.Task4;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main4 {
    public static void main(String[] args) throws IOException {
        Car car = new Car("Mercedes", 200, 5000);
        ObjectMapper mapper = new ObjectMapper();
        File file = new File("Lesson11/resources/Car.json");
        mapper.writeValue(file, car);
        car = mapper.readValue(file, Car.class);
        System.out.println(car.toString());
    }
}