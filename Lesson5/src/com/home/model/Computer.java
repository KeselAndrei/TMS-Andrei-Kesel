// Необходимо создать модуль Lesson5
// в папке src создать пакет com.home.model
// в пакете создать класс Computer

package com.home.model;

import java.util.Random;
import java.util.Scanner;

public class Computer {

// 1) класс Computer будет содержать следующие поля:
//    - процессор
//    - оперативка
//    - жесткий диск
//    - ресурс полных циклов работы (включений/выключений)

    public String cpu;
    public String ram;
    public String ssd;
    public int resource;
    public int inScanner;
    public boolean hasBurned = false;

    public Computer(String cpu, String ram, String ssd, int resource) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.resource = resource;
    }

//  2) класс Computer будет содержать следующие методы:
//     - метод описание(вывод всех полей)
//     - метод включить (on())
//     - при включении может произойти сбой, поэтому при вызове метода on() необходимо написать следующую логику:
//       на консоль вывести сообщение (Внимание! Введите 0 или 1)
//       создать экземпляр класса Random, который будет генерировать число 0 или 1.
//       если введенное вами число совпадет с рандомным, то компьютер выключается, вызывается метод off().
//       если введенное вами число не совпадет с рандомным, то компьютер сгорает.
//     - при повтороном включении компьютра, если он сгорел необходимо выдать сообщение "Компьютер сгорел!"
//     - выключить (off()) (аналогично включению)
//     - при превышении лимита ресурса комп сгорает. Пишем сообщение "Компьютер сгорел!"

    public void description() {
        System.out.println("В этом компьютере установлено: CPU " + cpu + ", RAM " + ram + ", SSD " + ssd + ".");
    }

    public void on() {
        if (!hasBurned) {
            count();
            clickOnOff();
        }
        testOn();
    }

    public void off() {
        if (!hasBurned) {
            count();
            clickOnOff();
        }
        testOff();
    }

    public void count() {
        resource--;
    }

    public void clickOnOff() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Внимание! Введите 0 или 1");
            while (!scanner.hasNextInt()) {
                System.out.println("Это не число!!! Введите 0 или 1");
                scanner.next();
            }
            inScanner = scanner.nextInt();
        } while (inScanner < 0 || inScanner > 1);
    }

    public int getRandomValue() {
        Random random = new Random();
        return random.nextInt(2);
    }

    public void testOn() {
        if (inScanner == getRandomValue() && !hasBurned && resource != 0) {
            System.out.println("Компьютер включается");
            off();
        } else if (resource == 0 && !hasBurned) {
            System.out.println("Компьютер сгорел!");
            hasBurned = true;
        } else {
            System.out.println("Компьютер сгорел!");
            hasBurned = true;
        }
    }

    public void testOff() {
        if (inScanner == getRandomValue() && !hasBurned && resource != 0) {
            System.out.println("Компьютер выключается");
            on();
        } else if (resource == 0 && !hasBurned) {
            System.out.println("Компьютер сгорел!");
            hasBurned = true;
        } else {
            System.out.println("Компьютер сгорел!");
            hasBurned = true;
        }
    }
}
