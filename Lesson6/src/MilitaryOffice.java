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


    public void getNameMilitaryService(PersonRegistry personRegistry) {
        System.out.println("Имена людей годных к военной службе на текущий момент времени: ");
        for (int i = 0; i < personRegistry.getArrayList().size(); i++) {
            if (personRegistry.getArrayList().get(i).getAge() >= 18 &&
                    personRegistry.getArrayList().get(i).getAge() <= 27 &&
                    personRegistry.getArrayList().get(i).getSex().equals(Person.MALE)) {
                System.out.println(personRegistry.getArrayList().get(i).getName());
            }
        }
        System.out.println();
    }

    public void getCountMilitaryServiceFromMinsk(PersonRegistry personRegistry) {
        for (int i = 0; i < personRegistry.getArrayList().size(); i++) {
            if (personRegistry.getArrayList().get(i).getAddress().getCity().equals("Минск") &&
                    personRegistry.getArrayList().get(i).getAge() >= 18 &&
                    personRegistry.getArrayList().get(i).getAge() <= 27 &&
                    personRegistry.getArrayList().get(i).getSex().equals(Person.MALE)) {
                count++;
            }
        }
        System.out.println("Количество годных призывников в городе Минске = " + count);
        System.out.println();
    }

    public void getAgeMilitaryService(PersonRegistry personRegistry) {
        count = 0;
        for (int i = 0; i < personRegistry.getArrayList().size(); i++) {
            if (personRegistry.getArrayList().get(i).getAge() >= 25 &&
                    personRegistry.getArrayList().get(i).getAge() <= 27 &&
                    personRegistry.getArrayList().get(i).getSex().equals(Person.MALE)) {
                count++;
            }
        }
        System.out.println("Количество призывников от 25 до 27 лет = " + count);
        System.out.println();
    }

    public void getNameMilitaryServiceAlexander(PersonRegistry personRegistry) {
        count = 0;
        for (int i = 0; i < personRegistry.getArrayList().size(); i++) {
            if (personRegistry.getArrayList().get(i).getName().equals("Александр") &&
                    personRegistry.getArrayList().get(i).getAge() >= 18 &&
                    personRegistry.getArrayList().get(i).getAge() <= 27 &&
                    personRegistry.getArrayList().get(i).getSex().equals(Person.MALE)) {
                count++;
            }
        }
        System.out.println("Количество призывников у которых имя Александр = " + count);
    }
}