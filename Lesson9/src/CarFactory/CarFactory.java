package CarFactory;


import Car.Car;
import Model.Model;

import java.util.ArrayList;
import java.util.Random;

public class CarFactory implements ICarFactory {
    Random random = new Random();
    String[] model = {"Mercedes", "Audi", "BMW", "Peugeot", "Renault"};

    private Car getGeneratedCar() {
        return new Car(new Model(model[generatedModel()]), generatedSpeed(), generatedPrice());
    }

    private int generatedSpeed() {
        if (random.nextInt(3) == 0) {
            return Speed.MAX_SPEED_200.getCount();
        } else if (random.nextInt(3) == 1) {
            return Speed.MAX_SPEED_220.getCount();
        } else {
            return Speed.MAX_SPEED_250.getCount();
        }
    }

    private int generatedModel() {
        return random.nextInt(model.length);
    }

    private int generatedPrice() {
        return random.nextInt(10) * 1000;
    }

    @Override
    public ArrayList<Car> getCreateCar() {
        ArrayList<Car> arrayList = new ArrayList<>();
        for (int i = 0; i < model.length; i++) {
            Car car = getGeneratedCar();
            arrayList.add(car);
        }
        return arrayList;
    }
}