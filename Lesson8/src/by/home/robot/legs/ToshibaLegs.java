package by.home.robot.legs;

public class ToshibaLegs implements ILeg {
    private final int price;

    public ToshibaLegs(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Шагает нога Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}