package by.home.robot;

import java.util.ArrayList;

/*
Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
Класс SonyHead является примером реализацией головы от Sony.
Создайте 3 робота с разными комплектующими.
Например у робота голова и нога от Sony а, рука от Samsung.
У всех роботов вызовите метод action.
Среди 3-х роботов найдите самого дорогого.
*/

public class Run {
    public static void main(String[] args) {
        FactoryRobots factoryRobots = new FactoryRobots();
        ArrayList<Robot> arrayList = factoryRobots.getCreteRobots();
        for (Robot robot : arrayList) {
            robot.action();
            System.out.println("Стоимость робота равна " + robot.getPrice());
        }
        factoryRobots.getMaxPrice(arrayList);
    }
}