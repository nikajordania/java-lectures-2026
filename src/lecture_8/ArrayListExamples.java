package lecture_8;

import java.util.ArrayList;
import java.util.List;


class ArrayListExamples {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(30);
        intList.add(1450);

        // remove by value
        Integer i = 10;
        intList.remove(i);

        // remove by index
        int index = 1;
        intList.remove(index);
    }
}
