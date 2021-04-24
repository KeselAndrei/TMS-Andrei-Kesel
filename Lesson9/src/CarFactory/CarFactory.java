package CarFactory;


import Car.Car;
import Model.IModel;
import Model.ModelAudi;
import Model.ModelBMW;
import Model.ModelMercedes;

import java.util.ArrayList;
import java.util.Random;

public class CarFactory {
    Random random = new Random();
    IModel[] iModels = {new ModelAudi(), new ModelBMW(), new ModelMercedes()};

    private Car getGeneratedCar() {
        return new Car(iModels[generatedModel()], Speed.MAXSPEED_220.getCount(), generatedPrice());
    }

    private int generatedModel() {
        return random.nextInt(iModels.length);
    }

    private int generatedPrice() {
        return random.nextInt(10) * 1000;
    }

    public ArrayList<Car> getCreateCar() {
        ArrayList<Car> arrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Car car = getGeneratedCar();
            arrayList.add(car);
        }
        return arrayList;
    }
}