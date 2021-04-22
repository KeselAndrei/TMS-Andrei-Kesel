package by.home.сosmodrome;

import java.util.Random;

public class Shuttle implements IStart {
    Random random = new Random();

    @Override
    public boolean firstSystemCheck() {
        return random.nextInt(11) > 3;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла");
    }
}