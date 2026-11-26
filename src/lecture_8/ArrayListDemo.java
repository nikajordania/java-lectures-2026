package lecture_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        // Create List
        List<String> names = new ArrayList<>();

        // Add elements
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Bob");  // allows duplicates

        // Insert at index
        names.add(1, "Inserted");

        // Access element
        System.out.println("names.get(2): " + names.get(2));

        // Update element
        names.set(2, "Updated");

        // Remove by index
        names.remove(1);

        // Remove by value
        names.remove("Charlie");

        // Check contains
        System.out.println("Contains Bob: " + names.contains("Bob"));

        // Get size
        System.out.println("Size: " + names.size());

        // Sort
        Collections.sort(names);

        // Iterate — 3 ways
        // Enhanced for loop
        for (String name : names) {
            System.out.println(name);
        }

        // Traditional for loop
        for (int i = 0; i < names.size(); i++)
            System.out.println(names.get(i));

        // Reverse iteration
        for (int i = names.size() - 1; i >= 0; i--) {
            System.out.println(names.get(i));
        }
    }
}
