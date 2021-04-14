import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

//3) PersonRegistry содержит список людей (Person), которые могут быть призваны в армию
@Getter
@Setter
@ToString
public class PersonRegistry {
    private ArrayList<Person> arrayList;

    public PersonRegistry(ArrayList<Person> arrayList) {
        this.arrayList = arrayList;
    }
}