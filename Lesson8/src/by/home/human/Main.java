package by.home.human;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FactoryHuman factoryHuman = new FactoryHuman();
        ArrayList<Human> arrayList = factoryHuman.getCreteHuman();
        for (Human human : arrayList) {
            System.out.println(human.getName() + " раздевается");
            human.undress();
            System.out.println(human.getName() + " одевается");
            human.getDressed();
        }
    }
}