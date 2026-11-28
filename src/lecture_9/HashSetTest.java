package lecture_9;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        Set<String> mySet2 = new LinkedHashSet<>();
        // HashSet does not guarantee any specific order
        mySet.add("Stuart");
        mySet.add("Alex");
        mySet.add("Alex");
        mySet.add("Johnny");
        mySet.add("Igor");
        mySet.add("Nika");

        System.out.println(mySet);

        // LinkedHashSet maintains insertion order
        mySet2.add("Stuart");
        mySet2.add("Alex");
        mySet2.add("Alex");
        mySet2.add("Johnny");
        mySet2.add("Igor");
        mySet2.add("Bel");

        System.out.println(mySet2);


        // Example list with duplicates
        List<String> namesWithDuplicates = List.of("Anna", "Bob", "Anna", "Cathy", "Bob", "David");
        System.out.println(namesWithDuplicates);

        // Remove duplicates by converting the list to a set
        Set<String> uniqueSet = new HashSet<>(namesWithDuplicates);
        System.out.println(uniqueSet);
    }
}