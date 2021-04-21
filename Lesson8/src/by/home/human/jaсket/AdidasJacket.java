package by.home.human.jaсket;

public class AdidasJacket implements IJacket {
    @Override
    public void putOn() {
        System.out.println("Надевает куртку Adidas");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимает куртку Adidas");
    }
}