package Car;

import CarIsNotStartException.CarIsNotStartException;

public interface ICar {
    void startCar() throws CarIsNotStartException;
}