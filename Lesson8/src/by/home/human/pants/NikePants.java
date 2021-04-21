package by.home.human.pants;

public class NikePants implements IPants {
    @Override
    public void putOn() {
        System.out.println("Надевает штаны Nike");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимает штаны Nike");
    }
}