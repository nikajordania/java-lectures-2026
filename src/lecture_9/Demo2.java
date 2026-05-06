
package lecture_9;

import java.util.HashSet;
import java.util.Set;

public class Demo2 {
    public static void main(String[] args) {
        Set<MutablePersonClassExample> set = new HashSet<>();

        MutablePersonClassExample p = new MutablePersonClassExample("Nika", 25);
        set.add(p);

        p.setName("ChangedName");

        System.out.println(set.contains(p));
        System.out.println(set.remove(p));

        System.out.println("Size: " + set.size());
    }
}
