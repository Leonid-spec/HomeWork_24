package homeWork_43;

import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<Person> people = generatePeople();
        System.out.println(people.stream().filter(person -> person.getAge()>25&& person.getCity()=="Berlin").collect(Collectors.toSet()));

    }

    private static List<Person> generatePeople() {
        return List.of(
                new Person("Trump", 78, "Berlin"),
                new Person("Tusk", 47, "Frankfurt"),
                new Person("Beiden", 87, "Frankfurt")

        );
    }
}