package Car;

import CarIsNotStartException.CarIsNotStartException;
import Model.IModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car implements ICar {
    public IModel iModel;
    public int maxSpeed;
    public int price;

    public Car(IModel iModel, int maxSpeed, int price) {
        this.iModel = iModel;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    @Override
    public void startCar() throws CarIsNotStartException {
        iModel.start();
    }
}