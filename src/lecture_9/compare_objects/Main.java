package lecture_9.compare_objects;

import lecture_9.model.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(List.of(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35)
        ));
        System.out.println(people);

        people.sort(Comparator.comparing(Person::getName));

        System.out.println(people);
    }
}
