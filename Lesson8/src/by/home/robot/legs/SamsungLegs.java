package by.home.robot.legs;

public class SamsungLegs implements ILeg {
    private final int price;

    public SamsungLegs(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Шагает нога Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}