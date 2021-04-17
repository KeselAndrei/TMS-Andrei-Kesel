package com.home;

import lombok.Getter;
import lombok.Setter;

// Наземный транспорт

@Setter
@Getter
public class LandTransport extends Transport {
    private int countWheels; // Количество колес
    private double fuelConsumption; // Расход топлива

    public LandTransport(int powerLs, int maxSpeed, int weight, String model, int countWheels, double fuelConsumption) {
        super(powerLs, maxSpeed, weight, model);
        this.countWheels = countWheels;
        this.fuelConsumption = fuelConsumption;
    }

    public String getInfo() {
        String info = "Мощность автомобиля состовляет " + getPowerLs() + " л.с., " + "максимальная скорость,\n" +
                "которую развивает автомобиль " + getMaxSpeed() + " км/ч, " + "масса автомобиля не превышает\n" +
                getWeight() + " кг, " + "марка автомобиля " + getModel() + ", у автомобиля " + getCountWheels() +
                " колеса,\n" + "расход топлива на 100 км составляет " + getFuelConsumption() + " литров";
        return info;
    }
}
