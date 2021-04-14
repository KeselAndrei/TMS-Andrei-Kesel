import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Person {
    public static final String MALE = "male";
    public static final String FEMALE = "female";
    private String name;
    private int age;
    private String sex;
    private Address address;

    public Person(String name, int age, String sex, Address address) {
        this.name = name;
        this.age = age;
        if (MALE.equals(sex) || FEMALE.equals(sex)) {
            this.sex = sex;
        }
        this.address = address;
    }
}