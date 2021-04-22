package by.home.human.jaсket;

public class NikeJacket implements IJacket {
    @Override
    public void putOn() {
        System.out.println("Надевает куртку Nike");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимает куртку Nike");
    }
}