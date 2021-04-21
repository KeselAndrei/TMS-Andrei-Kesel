package by.home.human;

import by.home.human.boots.AdidasBoots;
import by.home.human.boots.IBoots;
import by.home.human.boots.NikeBoots;
import by.home.human.jaсket.AdidasJacket;
import by.home.human.jaсket.IJacket;
import by.home.human.jaсket.NikeJacket;
import by.home.human.pants.AdidasPants;
import by.home.human.pants.IPants;
import by.home.human.pants.NikePants;

import java.util.ArrayList;
import java.util.Random;

public class FactoryHuman {
    private final Random random = new Random();
    private final String[] name = {"Валера", "Коля", "Вася"};
    private final IBoots[] iBoots = {new AdidasBoots(), new NikeBoots()};
    private final IJacket[] iJakets = {new AdidasJacket(), new NikeJacket()};
    private final IPants[] iPants = {new AdidasPants(), new NikePants()};

    private Human getGeneratedHuman() {
        return new Human(name[generatedName()], iBoots[generatedBots()], iJakets[generatedJaket()], iPants[generatedPants()]);
    }

    private int generatedName() {
        return random.nextInt(name.length);
    }

    private int generatedPants() {
        return random.nextInt(iPants.length);
    }

    private int generatedJaket() {
        return random.nextInt(iJakets.length);
    }

    private int generatedBots() {
        return random.nextInt(iBoots.length);
    }

    public ArrayList<Human> getCreteHuman() {
        ArrayList<Human> arrayList = new ArrayList<>();
        for (int i = 0; i < random.nextInt(5); i++) {
            Human human = getGeneratedHuman();
            arrayList.add(human);
        }
        return arrayList;
    }
}