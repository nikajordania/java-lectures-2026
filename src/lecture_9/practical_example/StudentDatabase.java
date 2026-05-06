package lecture_9.practical_example;

import java.util.*;

public class StudentDatabase {

    private Map<Integer, Student> database = new HashMap<>();

    // add student to database and assign unique id dynamically (size of hashmap + 1)
    public void addStudent(Student student) {
        int i = database.size() + 1;
        student.setId(i);
        database.put(student.getId(), student);
    }

    // remove student by id
    public void removeStudent(int id) {
        database.remove(id);
    }

    // find student by id and return Student object
    public Student findStudent(int id) {
        return database.get(id);
    }

    // return top 3 students with the highest average grades
    public List<Student> top3Students() {

        List<Student> list = new ArrayList<>(database.values());
        Collections.sort(list);

        List<Student> result = new ArrayList<>();

        for (int i = 0; i < list.size() && i < 3; i++) {
            result.add(list.get(i));
        }

        return result;
    }
}
