package com.home;

import lombok.Getter;
import lombok.Setter;

// Гражданский транспорт

@Getter
@Setter
public class CivilTransport extends AirTransport {
    private int countPassengers; // Кол-во пассажиров
    private boolean chekBusinessClass; // Наличие бизнес класса

    public CivilTransport(int powerLs, int maxSpeed, int weight, String model, int wingspan, int stripLength,
                          int countPassengers, boolean chekBusinessClass) {
        super(powerLs, maxSpeed, weight, model, wingspan, stripLength);
        this.countPassengers = countPassengers;
        this.chekBusinessClass = chekBusinessClass;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "количество пассажиров перевозимых на борту не более " + countPassengers +
                ", наличие бизнес класса " + chekBusinessClass;
    }

    String getCheckOfPassengersCount(int countPas) {
        if (countPas <= countPassengers) {
            return "Самолет заполнен!";
        } else {
            return "Вам нужен самолет побольше! ";
        }
    }
}