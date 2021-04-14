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

    public void getCountMilitaryServiceFromMinsk(PersonRegistry personRegistry) {
        for (int i = 0; i < personRegistry.getArrayList().size(); i++) {
            Person person = personRegistry.getArrayList().get(i);
            if (person.getAddress().getCity().equals("Минск") && chek(person)) {
                count++;
            }
        }
        System.out.println("Количество годных призывников в городе Минске = " + count);
        System.out.println();
    }

    public void getAgeMilitaryService(PersonRegistry personRegistry) {
        count = 0;
        for (int i = 0; i < personRegistry.getArrayList().size(); i++) {
            Person person = personRegistry.getArrayList().get(i);
            if (chek(person) && person.getAge() >= 25 && person.getAge() <= 27) {
                count++;
            }
        }
        System.out.println("Количество призывников от 25 до 27 лет = " + count);
        System.out.println();
    }

    public void getNameMilitaryServiceAlexander(PersonRegistry personRegistry) {
        count = 0;
        for (int i = 0; i < personRegistry.getArrayList().size(); i++) {
            Person person = personRegistry.getArrayList().get(i);
            if (person.getName().equals("Александр") && chek(person)) {
                count++;
            }
        }
        System.out.println("Количество призывников у которых имя Александр = " + count);
    }
}