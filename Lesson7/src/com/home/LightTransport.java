package com.home;

import lombok.Getter;
import lombok.Setter;

// Легковой транспорт

@Getter
@Setter
public class LightTransport extends LandTransport {
    private String bodyType; // Тип кузова
    private int countPassengers; // Кол-во пассажиров

    public LightTransport(int powerLs, int maxSpeed, int weight, String model,
                          int countWheels, double fuelConsumption, String bodyType, int countPassengers) {
        super(powerLs, maxSpeed, weight, model, countWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.countPassengers = countPassengers;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", тип кузова " + getBodyType() + ",\nколичество пассажиров " + getCountPassengers() +
                " мощность в кВт = " + getPowerCalculation();
    }


    private double getPowerCalculation() {
        return getPowerLs() * 0.74;
    }

    String getCountDistance(double time) {
        double distance = time * getMaxSpeed();
        return "За время " + time + " ч, автомобиль " + getModel() + " двигаясь с максимальной скоростью " + getMaxSpeed() +
                " км/ч проедет " + distance + " км и израсходует " + getConsumptionsFuel(time) + " литров топлива.";
    }

    private double getConsumptionsFuel(double time) {
        double distance = time * getMaxSpeed();
        double fuelConsumption = (distance * getFuelConsumption()) / 100;
        return fuelConsumption;
    }
}