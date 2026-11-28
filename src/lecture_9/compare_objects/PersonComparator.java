package lecture_9.compare_objects;


import lecture_9.model.Person;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.getAge(), p2.getAge());
    }
}
