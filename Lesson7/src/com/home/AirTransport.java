package com.home;

import lombok.Getter;
import lombok.Setter;

// Воздушный транспорт

@Getter
@Setter
public class AirTransport extends Transport {
    private int wingspan; // Размах крыльев
    private int stripLength; // Мин. длина взлетно - посадочной полосы

    public AirTransport(int powerLs, int maxSpeed, int weight, String model, int wingspan, int stripLength) {
        super(powerLs, maxSpeed, weight, model);
        this.wingspan = wingspan;
        this.stripLength = stripLength;
    }

    public String getInfo() {
        return "Мощность самолета состовляет " + getPowerLs() + " л.с., " + "максимальная скорость,\n" +
                "которую развивает самолет " + getMaxSpeed() + " км/ч, " + "масса самолета не превышает\n" +
                getWeight() + " кг, " + "марка самолета " + getModel() + ", у самолета размах крыльев равен " +
                wingspan + " м,\nминимальная длина взлетно - посадочной полосы должна быть не менее " + stripLength + " м,\n";
    }
}