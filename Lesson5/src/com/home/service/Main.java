//  3) создать пакет com.home.service
//  создать класс Main создать метод main
//  создать экземпляр класса Computer или реальный объект, через конструктор передать значение полей класса,
//  т.е необходимо сгенерировать конструктор с полями класса перечислеными в 1 пункте
//  Далее у объекта Computer вызвать его методы, в которых будет реализована логика по включению, выключению
//  и выводу информации про него.

package com.home.service;

import com.home.model.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Intel Core i9 9900 3100 МГц", "DDR4 16 ГБ", "960 ГБ", 10);
        computer.description();
        computer.on();
        computer.off();
        System.out.println();
        computer.on();
        computer.off();
    }
}