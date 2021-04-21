package by.home.human;

import by.home.human.boots.IBoots;
import by.home.human.jaсket.IJacket;
import by.home.human.pants.IPants;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Human implements IHuman {
    private String name;
    private IBoots iBoots;
    private IJacket iJaket;
    private IPants iPants;

    @Override
    public void getDressed() {
        iBoots.putOn();
        iJaket.putOn();
        iPants.putOn();
    }

    @Override
    public void undress() {
        iBoots.takeOff();
        iJaket.takeOff();
        iPants.takeOff();
    }
}