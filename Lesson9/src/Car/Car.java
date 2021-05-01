package Car;

import CarIsNotStartException.CarIsNotStartException;
import Model.Model;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter
public class Car implements ICar {
    public Model model;
    public int maxSpeed;
    public int price;

    public Car(Model iModel, int maxSpeed, int price) {
        this.model = iModel;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    @Override
    public void startCar() throws CarIsNotStartException {
        Random random = new Random();
        if (random.nextInt(21) % 2 == 0) {
            throw new CarIsNotStartException(model.getModel() + " не заводится.");
        } else {
            System.out.println(model.getModel() + " завелась");
        }
    }
}
