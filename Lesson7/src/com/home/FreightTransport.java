package com.home;

// Грузовой транспорт

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FreightTransport extends LandTransport {
    private int carryingCapacity; // Грузоподъемность

    public FreightTransport(int Power, int maxSpeed, int weight, String model, int countWheels,
                            double fuelConsumption, int carryingCapacity) {
        super(Power, maxSpeed, weight, model, countWheels, fuelConsumption);
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", грузоподъемность автомобиля составляет " + carryingCapacity + " тонны";
    }

    String getCheckOfCapacity(int capacity) {
        if (capacity <= carryingCapacity) {
            return "Грузовик загружен!";
        } else {
            return "Вам нужен грузовик побольше! ";
        }
    }
}