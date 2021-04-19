package com.home;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// Транспорт

@Getter
@Setter
@AllArgsConstructor
public class Transport {
    private int powerLs; // Мощность
    private int maxSpeed; // Макс скорость
    private int weight; // Масса
    private String model; // Марка
}