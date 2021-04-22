package by.home.human.boots;

public class AdidasBoots implements IBoots {
    @Override
    public void putOn() {
        System.out.println("Надевает обувь Adidas");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимает обувь Adidas");
    }
}