package by.home.robot.legs;

public class SonyLegs implements ILeg {
    private final int price;

    public SonyLegs(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Шагает нога Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}