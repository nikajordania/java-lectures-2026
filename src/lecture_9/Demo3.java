package lecture_9;

import java.util.HashSet;
import java.util.Set;

public class Demo3 {
    public static void main(String[] args) {
        Set<GoodPersonClassExample> set = new HashSet<>();

        // Adding two identical Person objects
        // because equals and hashCode are properly overridden it prevents duplicates
        set.add(new GoodPersonClassExample("Alice", 30));
        set.add(new GoodPersonClassExample("Alice", 30));

        System.out.println("Size: " + set.size()); // everything is correct
    }
}
