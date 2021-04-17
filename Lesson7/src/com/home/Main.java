package com.home;

public class Main {
    public static void main(String[] args) {
        LightTransport lightTransport = new LightTransport(100, 230, 2500, "Audi", 4,
                5.5, "купе", 4);
        System.out.println(lightTransport.getInfo());
        System.out.println();
        System.out.println(lightTransport.getCountDistance(4));
        System.out.println("____________________________________________________________________________________________");
        FreightTransport freightTransport = new FreightTransport(250, 100, 3800, "МАЗ", 4,
                15, 3);
        System.out.println(freightTransport.getInfo());
        System.out.println();
        System.out.println(freightTransport.getCheckOfCapacity(4));
        System.out.println("____________________________________________________________________________________________");
        CivilTransport civilTransport = new CivilTransport(1000, 1000, 10000, "Boing",
                30, 500, 100, false);
        System.out.println(civilTransport.getInfo());
        System.out.println();
        System.out.println(civilTransport.getCheckOfPassengersCount(10));
        System.out.println("____________________________________________________________________________________________");
        MilitaryTransport militaryTransport = new MilitaryTransport(900, 700, 10000, "Миг - 29",
                20, 250, false, 0);
        System.out.println();
        System.out.println(militaryTransport.getInfo());
        System.out.println();
        System.out.println(militaryTransport.getShot());
        System.out.println();
        System.out.println(militaryTransport.getBailout());
    }
}