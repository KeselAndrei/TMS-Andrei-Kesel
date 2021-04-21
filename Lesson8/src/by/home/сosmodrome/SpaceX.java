package by.home.сosmodrome;

import java.util.Random;

public class SpaceX implements IStart {
    Random random = new Random();

    @Override
    public boolean firstSystemCheck() {
        return random.nextInt(15) % 2 == 0;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели SpaceX запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт SpaceX");
    }
}