package lecture_9;

import java.util.HashSet;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        Set<WrongPersonClassExample> set = new HashSet<>();

        set.add(new WrongPersonClassExample("Nika", 25));
        set.add(new WrongPersonClassExample("Nika", 25));

        System.out.println("Size: " + set.size());
    }
}
