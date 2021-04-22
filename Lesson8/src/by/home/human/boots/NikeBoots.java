package by.home.human.boots;

public class NikeBoots implements IBoots {
    @Override
    public void putOn() {
        System.out.println("Надевает обувь Nike");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимает обувь Nike");
    }
}