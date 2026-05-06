package lecture_9.practical_example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        StudentDatabase db = new StudentDatabase();

        db.addStudent(new Student("Alice", "Johnson", "G1", List.of(90, 85, 92)));

        db.addStudent(new Student("Brandon", "Smith", "G2", List.of(88, 91, 95)));

        db.addStudent(new Student("Clara", "Davis", "G1", List.of(70, 76, 80)));

        db.addStudent(new Student("Daniel", "Martinez", "G3", List.of(99, 97, 100)));

        System.out.println("\nTop 3 Students:");
        for (Student s : db.top3Students()) {
            System.out.println(s);
        }
    }
}
