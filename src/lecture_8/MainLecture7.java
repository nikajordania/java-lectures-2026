package lecture_8;

import java.util.*;

public class MainLecture7 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("John", 25));
        list.add(new Person("Alice", 30));
        list.add(new Person("Bob", 20));
        list.add(new Person("Alice", 30)); // Duplicate

        System.out.println("Original List:");

        for (Person p : list) {
            System.out.println(p);
        }

        List<String> l1 = new ArrayList<>();

        l1.add("Hello");
        l1.add("asd");
        l1.add("asd");
        l1.add("asd");
        l1.add("World");

        System.out.println(l1);

        // Sorting the list
        Collections.sort(l1);

        System.out.println(l1);

        // Removing duplicates by converting to a Set
        Set<String> setObj1 = new HashSet<>(l1);
        System.out.println(setObj1);

    }
}
