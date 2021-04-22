package by.home.robot;

import by.home.robot.hands.IHand;
import by.home.robot.hands.SamsungHand;
import by.home.robot.hands.SonyHand;
import by.home.robot.hands.ToshibaHand;
import by.home.robot.heads.IHead;
import by.home.robot.heads.SamsungHead;
import by.home.robot.heads.SonyHead;
import by.home.robot.heads.ToshibaHead;
import by.home.robot.legs.ILeg;
import by.home.robot.legs.SamsungLegs;
import by.home.robot.legs.SonyLegs;
import by.home.robot.legs.ToshibaLegs;

import java.util.ArrayList;
import java.util.Random;

public class FactoryRobots {
    private final Random random = new Random();
    private final IHead[] HEAD = {new SamsungHead(randomPrice()), new SonyHead(randomPrice()), new ToshibaHead(randomPrice())};
    private final IHand[] HAND = {new SamsungHand(randomPrice()), new SonyHand(randomPrice()), new ToshibaHand(randomPrice())};
    private final ILeg[] LEG = {new SamsungLegs(randomPrice()), new SonyLegs(randomPrice()), new ToshibaLegs(randomPrice())};

    private Robot getGeneratedRobots() {
        return new Robot(HAND[generateHand()], HEAD[generateHead()], LEG[generateLeg()]);
    }

    private int generateHead() {
        return random.nextInt(HEAD.length);
    }

    private int generateHand() {
        return random.nextInt(HAND.length);
    }

    private int generateLeg() {
        return random.nextInt(LEG.length);
    }

    private int randomPrice() {
        return random.nextInt(100);
    }

    public ArrayList<Robot> getCreteRobots() {
        ArrayList<Robot> arrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Robot robot = getGeneratedRobots();
            arrayList.add(robot);
        }
        return arrayList;
    }

    public void getMaxPrice(ArrayList<Robot> arrayList) {
        int maxPrice = arrayList.get(0).getPrice();
        int number = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (maxPrice <= arrayList.get(i).getPrice()) {
                maxPrice = arrayList.get(i).getPrice();
                number = i;
            }
        }
        number += 1;
        System.out.println("Самый дорогой робот № " + number + " он стоит - " + maxPrice);
    }
}