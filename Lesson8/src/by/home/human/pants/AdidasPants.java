package by.home.human.pants;

public class AdidasPants implements IPants {
    @Override
    public void putOn() {
        System.out.println("Надевает штаны Adidas");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимает штаны Adidas");
    }
}