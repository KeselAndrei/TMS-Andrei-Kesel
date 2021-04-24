package Model;

import CarIsNotStartException.CarIsNotStartException;
import lombok.Getter;
import lombok.ToString;

import java.util.Random;

@ToString
@Getter
public class ModelAudi implements IModel {
    private final String MODEL = "Audi";

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