package by.home.robot;

import by.home.robot.hands.IHand;
import by.home.robot.heads.IHead;
import by.home.robot.legs.ILeg;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Robot implements IRobot {
    private IHand hand;
    private IHead head;
    private ILeg leg;

    @Override
    public void action() {
        head.speak();
        hand.upHand();
        leg.step();
    }

    @Override
    public int getPrice() {
        return head.getPrice() + hand.getPrice() + leg.getPrice();
    }
}