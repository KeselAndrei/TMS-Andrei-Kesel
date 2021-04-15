import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MilitaryOffice {
    private PersonRegistry personRegistry;
    private int count = 0;

    public MilitaryOffice(PersonRegistry personRegistry) {
        this.personRegistry = personRegistry;
    }

    private boolean chek(Person person) {
        return person.getAge() >= 18 && person.getAge() <= 27 && person.getSex().equals(Person.MALE);
    }

    public void getNameMilitaryService(PersonRegistry personRegistry) {
        System.out.println("Имена людей годных к военной службе на текущий момент времени: ");
        for (int i = 0; i < personRegistry.getArrayList().size(); i++) {
            Person person = personRegistry.getArrayList().get(i);
            if (chek(person)) {
                System.out.println(person.getName());
            }
        }
        System.out.println();
    }

    public void getCountMilitaryServiceFromMinsk(String city) {
        for (int i = 0; i < personRegistry.getArrayList().size(); i++) {
            Person person = personRegistry.getArrayList().get(i);
            if (person.getAddress().getCity().equals(city) && chek(person)) {
                count++;
            }
        }
        System.out.println("Количество годных призывников в городе " + city + " = " + count);
        System.out.println();
    }

    public void getAgeMilitaryService(int minAge, int maxAge) {
        count = 0;
        for (int i = 0; i < personRegistry.getArrayList().size(); i++) {
            Person person = personRegistry.getArrayList().get(i);
            if (chek(person) && person.getAge() >= minAge && person.getAge() <= maxAge) {
                count++;
            }
        }
        System.out.println("Количество призывников от " + minAge + " до " + maxAge + " лет = " + count);
        System.out.println();
    }

    public void getNameMilitaryServiceAlexander(String name) {
        count = 0;
        for (int i = 0; i < personRegistry.getArrayList().size(); i++) {
            Person person = personRegistry.getArrayList().get(i);
            if (person.getName().equals(name) && chek(person)) {
                count++;
            }
        }
        System.out.println("Количество призывников у которых имя " + name + " = " + count);
    }
}