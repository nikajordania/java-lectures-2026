package lecture_9.compare_objects;

import lecture_9.model.Address;
import lecture_9.model.Person;
import lecture_9.model.Person2;

import java.util.ArrayList;
import java.util.List;

public class ComparatorDemo {

    public static void main(String[] args) {

        // Example data (Person)
        List<Person> people = new ArrayList<>(List.of(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 30),
                new Person("Dave", 20)
        ));

        // Example data (Person2)
        List<Person2> people2 = new ArrayList<>(List.of(
                new Person2("Alice", 30, new Address("Paris", "France")),
                new Person2("Alice", 30, new Address("Berlin", "Germany")),
                new Person2("Bob", 25, new Address("Rome", "Italy"))
        ));

        System.out.println("ComparatorExamples (Age Ascending)");
        people.sort(new ComparatorExamples());
        System.out.println(people);

        System.out.println("\nReverseNameComparator (Name Descending)");
        people.sort(new ReverseNameComparator());
        System.out.println(people);

        System.out.println("\nAgeThenNameComparator (Age Ascending, Name Ascending)");
        people.sort(new AgeThenNameComparator());
        System.out.println(people);

        System.out.println("\nNameLengthComparator (Name Length Ascending)");
        people.sort(new NameLengthComparator());
        System.out.println(people);

        System.out.println("\nReverseAgeComparator (Age Descending)");
        people.sort(new ReverseAgeComparator());
        System.out.println(people);

        System.out.println("\nNameAndReverseAgeComparator (Name Ascending, Age Descending)");
        people.sort(new NameAndReverseAgeComparator());
        System.out.println(people);

        System.out.println("\nCustomPersonComparator (Name → Age → City → Country)");
        people2.sort(new CustomPersonComparator());
        System.out.println(people2);
    }
}
