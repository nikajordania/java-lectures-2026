package lecture_3.staticMethod;

public class Student {
    // Static variable - shared variable by all instances
    static int totalStudents = 0;

    // Instance variable - unique to each object
    String name;

    // Static block - runs once when the class is loaded
    static {
        System.out.println("Static block: Student class loaded!");
    }

    // Constructor - increases totalStudents count
    public Student(String name) {
        this.name = name;
        totalStudents++;
    }

    // Static method - can access only static members
    public static void showTotalStudents() {
        System.out.println("Total students so far: " + totalStudents);
    }

    // Instance method - can access both static and non-static members
    public void introduce() {
        System.out.println("Hi, I am " + name);
    }

    public static void main(String[] args) {
        // Access static method without creating an object
        Student.showTotalStudents();

        // Create objects
        Student s1 = new Student("Nika");
        Student s2 = new Student("Nino");

        // Each student introduces themselves
        s1.introduce();
        s2.introduce();

        // Static variable shared among all objects
        Student.showTotalStudents();

        // Access static variable directly via class name (preferred)
        System.out.println("Access via class: " + Student.totalStudents);

        // Access via instance (not recommended but allowed)
        System.out.println("Access via instance: " + s1.totalStudents);
    }
}
