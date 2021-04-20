package com.home;

// Военный транспорт

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MilitaryTransport extends AirTransport {
    private boolean chekEjectionSystem; // Наличие системы катапультирования
    private int countRockets; // Кол-во ракет на борту

    public MilitaryTransport(int powerLs, int maxSpeed, int weight, String model,
                             int wingspan, int stripLength, boolean chekEjectionSystem, int countRockets) {
        super(powerLs, maxSpeed, weight, model, wingspan, stripLength);
        this.chekEjectionSystem = chekEjectionSystem;
        this.countRockets = countRockets;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "наличие системы катапультирования " + chekEjectionSystem +
                ", количество ракет на борту равно " + countRockets;
    }

    String getShot() {
        if (countRockets > 0) {
            return "Ракета пошла...";
        } else {
            return "Боеприпасы отсутствуют";
        }
    }

    String getBailout() {
        if (isChekEjectionSystem()) {
            return "Катапультирование прошло успешно!!!";
        } else {
            return "У Вас нет системы катапультирования!!!";
        }
    }
}