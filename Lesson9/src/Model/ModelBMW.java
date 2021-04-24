package Model;

import CarIsNotStartException.CarIsNotStartException;
import lombok.ToString;

import java.util.Random;

@ToString
public class ModelBMW implements IModel {
    private final String MODEL = "BMW";

    @Override
    public void start() throws CarIsNotStartException {
        Random random = new Random();
        if (random.nextInt(21) % 2 == 0) {
            throw new CarIsNotStartException(MODEL + " не заводится.");
        } else {
            System.out.println(MODEL + " завелась");
        }
    }
}