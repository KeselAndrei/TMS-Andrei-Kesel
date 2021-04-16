import lombok.ToString;

import java.util.ArrayList;

//        Домашка: 6 урок
//        Необходимо написать военкомат.
//        1) Создаем класс военкомат MilitaryOffice
//        2) Создать в классе MilitaryOffice конструктор, который принимает PersonRegistry
//        3) PersonRegistry содержит список людей (Person), которые могут быть призваны в армию
//        4) Создать класс Person, который будет содержать следующие поля имя, возраст, пол, адрес(страна, город)
//
//        Военкомат должен уметь:
//        a) вывести имена всех людей годных к военной службе на текущий момент времени, которые есть в PersonRegistry
//        T.е нужно написать метод в классе MilitaryOffice, который будет отфильтровывать годных к службе призывников
//        (годными считать мущин от 18 до 27 лет, проверяем пол и возраст)
//        б) вывести количество годных призывников в городе Минске.
//        в) вывести количество призывников от 25 до 27 лет
//        г) вывести количество призывников у которых имя Александр.
//
//        5) Создать класс Main, наполнить PersonRegistry людьми, по желанию можно создавать людей через консоль

@ToString
public class Main {
    public static void main(String[] args) {
        ArrayList<Person> arrayList = new ArrayList<>();
        Person person1 = new Person("Игорь", 18, Person.MALE, new Address("Беларусь", "Минск"));
        arrayList.add(person1);
        Person person2 = new Person("Коля", 27, Person.MALE, new Address("Беларусь", "Брест"));
        arrayList.add(person2);
        Person person3 = new Person("Марина", 16, Person.FEMALE, new Address("Беларусь", "Борисов"));
        arrayList.add(person3);
        Person person4 = new Person("Катя", 18, Person.FEMALE, new Address("Беларусь", "Барановичи"));
        arrayList.add(person4);
        Person person5 = new Person("Вася", 16, Person.MALE, new Address("Беларусь", "Минск"));
        arrayList.add(person5);
        Person person6 = new Person("Володя", 25, Person.MALE, new Address("Беларусь", "Минск"));
        arrayList.add(person6);
        Person person7 = new Person("Александр", 25, Person.MALE, new Address("Беларусь", "Минск"));
        arrayList.add(person7);
        Person person8 = new Person("Александр", 18, Person.MALE, new Address("Беларусь", "Минск"));
        arrayList.add(person8);
        PersonRegistry personRegistry = new PersonRegistry(arrayList);
        MilitaryOffice militaryOffice = new MilitaryOffice(personRegistry);
        militaryOffice.getNameMilitaryService();
        System.out.println("Количество годных призывников в городе Минске = " +
                militaryOffice.getCountMilitaryServiceFromMinsk("Минск"));
        System.out.println("Количество призывников от 18 до 27 лет = " +
                militaryOffice.getAgeMilitaryService(18, 27));
        System.out.println("Количество призывников у которых имя Александр = " +
                militaryOffice.getNameMilitaryServiceAlexander("Александр"));
    }
}