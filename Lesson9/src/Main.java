//  Создать собственное исключение
//  Создать класс Car c полями (марка, скорость, цена),
//  конструкторы (с параметрами и default) гетеры-сетеры.
//  Создать метод старт в котором пытаетесь завести автомобиль.
//  В методе старт генерируете случайное число от 0 до 20, если
//  полученное число оказалось четным, то выбрасываете созданное
//  ранее вами исключение и передаете его к месту откуда вызывали
//  метод старт. Если все хорошо и исключение не вылетело, то выводить
//  в консоль сообщение что автомобиль с такой-то маркой завелся.
//  В main создаете парочку автомобилей и пытаетесь их завести.
//  И обрабатываете исключение которое может вылететь при старте автомобиля

import Car.Car;
import CarFactory.CarFactory;
import CarIsNotStartException.CarIsNotStartException;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        ArrayList<Car> arrayList = carFactory.getCreateCar();
        for (Car value : arrayList) {
            try {
                value.startCar();
            } catch (CarIsNotStartException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}