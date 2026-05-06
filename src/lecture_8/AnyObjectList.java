package lecture_8;

import java.util.ArrayList;
import java.util.List;

public class AnyObjectList {
    public static void main(String[] args) {
        List<Object> l2 = new ArrayList<>();

        l2.add(10);
        l2.add("Hello");
        l2.add(15.5);

        System.out.println(l2);

        // Extracting only integers from the list
        List<Integer> l3 = new ArrayList<>();
        for (Object obj : l2) {
            if (obj instanceof Integer) {
                l3.add((Integer) obj);
                System.out.println("Integer: " + obj);
            }
        }

        System.out.println(l3);


        List<Object> objectArray = new ArrayList<>();

        objectArray.add(new Object());
        objectArray.add("nika");
        objectArray.add("alex");
        objectArray.add("bob");
        objectArray.add("john");
        objectArray.add(123);
        objectArray.add(45.67);
        objectArray.add(true);

        for (Object obj : objectArray) {
            if (obj instanceof String str) {
                System.out.println("String value: " + str);

            } else if (obj instanceof Integer intValue) {
                System.out.println("Integer value: " + intValue);

            } else if (obj instanceof Double doubleValue) {
                System.out.println("Double value: " + doubleValue);

            } else if (obj instanceof Boolean boolValue) {
                System.out.println("Boolean value: " + boolValue);

            } else {
                System.out.println("Other object: " + obj.toString());
            }

        }
    }
}
