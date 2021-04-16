import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MilitaryOffice {
    private PersonRegistry personRegistry;

    private boolean hasFitMilitaryService(Person person) {
        return person.getAge() >= 18 && person.getAge() < 27 && person.getSex().equals(Person.MALE);
    }

    public void getNameMilitaryService() {
        System.out.println("Имена людей годных к военной службе на текущий момент времени: ");
        for (int i = 0; i < personRegistry.getArrayList().size(); i++) {
            Person person = personRegistry.getArrayList().get(i);
            if (hasFitMilitaryService(person)) {
                System.out.println(person.getName());
            }
        }
        System.out.println();
    }

    public int getCountMilitaryServiceFromMinsk(String city) {
        int count = 0;
        for (int i = 0; i < personRegistry.getArrayList().size(); i++) {
            Person person = personRegistry.getArrayList().get(i);
            if (person.getAddress().getCity().equals(city) && hasFitMilitaryService(person)) {
                count++;
            }
        }
        System.out.println();
        return count;
    }

    public int getAgeMilitaryService(int minAge, int maxAge) {
        int count = 0;
        for (int i = 0; i < personRegistry.getArrayList().size(); i++) {
            Person person = personRegistry.getArrayList().get(i);
            if (person.getSex().equals(Person.MALE) && person.getAge() >= minAge && person.getAge() <= maxAge) {
                count++;
            }
        }
        System.out.println();
        return count;
    }

    public int getNameMilitaryServiceAlexander(String name) {
        int count = 0;
        for (int i = 0; i < personRegistry.getArrayList().size(); i++) {
            Person person = personRegistry.getArrayList().get(i);
            if (person.getName().equals(name) && hasFitMilitaryService(person)) {
                count++;
            }
        }
        System.out.println();
        return count;
    }
}