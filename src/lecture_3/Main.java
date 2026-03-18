package lecture_3;

import lecture_3.interfaces.*;
import lecture_3.staticMethod.*;
import lecture_3.staticMethod.Car;

public class Main {

    public static void main(String[] args) {

        // Static vs instance methods
        System.out.println("Calculator: Static vs Instance Methods");
        int sum = Calculator.add(5, 3);                  // no object initialization needed
        System.out.println("Sum (static method): " + sum);
        Calculator calc = new Calculator();
        System.out.println("Product (instance method): " + calc.multiply(5, 3));
        System.out.println();

        // Static variable shared by all instances
        System.out.println("StaticCount: Shared Static Variable");
        StaticCount sc1 = new StaticCount();
        StaticCount sc2 = new StaticCount();
        StaticCount sc3 = new StaticCount();
        sc1.count = 10;
        System.out.println("Count via sc1: " + sc1.count); // 10
        System.out.println("Count via sc2: " + sc2.count); // 10 — same variable
        System.out.println("Count via sc3: " + sc3.count); // 10 — same variable
        System.out.println("Preferred: " + StaticCount.count); // access to count without instance
        System.out.println();

        // Static block, static method, instance method
        System.out.println("Student: Static Block, Static & Instance Methods");
        Student.showTotalStudents();  // before any object exists
        Student s1 = new Student("Nika");  // static block fires on first load
        Student s2 = new Student("Nino");
        s1.introduce();
        s2.introduce();
        Student.showTotalStudents();
        System.out.println();

        // Static block, constant, shared counter
        System.out.println("Car (staticMethod): Static Block, Constant & showStats");
        Car car1 = new Car("Toyota");
        Car car2 = new Car("Honda");
        Car.showStats();
        System.out.println();

        // Chained static utility calls
        System.out.println("Factorial: Chained Static Calls");
        System.out.println("3! = " + MethodCall.getFactorialOf3()); // delegates to Factorial
        System.out.println("5! = " + Factorial.getFactorial(5));
        try {
            Factorial.getFactorial(0);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }
        System.out.println();

        // Abstract, default, and static interface methods
        System.out.println("MyInterface: Abstract, Default & Static Methods");
        MyInterface.info();  // static method on the interface
        MyClass myObj = new MyClass();
        myObj.display();
        myObj.print();  // overrides the default
        System.out.println("Sum: " + myObj.sum(3, 4));
        System.out.println();

        // Default method used without override
        System.out.println("MyClass2: Default Method Without Override");
        MyClass2 myObj2 = new MyClass2();
        myObj2.display();
        myObj2.print();  // falls back to interface default
        System.out.println();

        // Implementing multiple interfaces
        System.out.println("Car (interfaces): Multiple Interface Implementation");
        lecture_3.interfaces.Car sportsCar = new lecture_3.interfaces.Car("Tesla");
        sportsCar.start();
        sportsCar.boost();  // from TurboBoost
        sportsCar.stop();
        Vehicle v = new lecture_3.interfaces.Car("BMW");
        v.start();  // only Vehicle methods visible
        System.out.println();

        // Private interface method shared across default methods
        System.out.println("Calculatable: Private Interface Method");
        CalculatableClass cc = new CalculatableClass();
        System.out.println("Sum(2, 3)    = " + cc.sum(2, 3));
        System.out.println("Sum(1, 2, 3) = " + cc.sum(1, 2, 3));
        System.out.println();

        // Interface as a contract: two different implementations
        System.out.println("Accounts: MobileBank Implementation");
        Accounts mobile = new MobileBank();
        mobile.showWelcomeMessage();  // inherited default method
        mobile.personRegistration("Ana", "Abashidze", "ana@mail.com", "pass123");
        mobile.personLogin("ana@mail.com", "pass123");
        mobile.personProfile();
        mobile.updatePersonEmail("ana_new@mail.com");
        mobile.personLogout();
        System.out.println();

        System.out.println("Accounts: InternetBank Implementation");
        Accounts internet = new InternetBank();
        internet.showWelcomeMessage();  // same default, different class
        internet.personRegistration("Giorgi", "Giorgadze", "giorgi@mail.com", "pass456");
        internet.personLogin("giorgi@mail.com", "pass456");
        internet.personProfile();
        internet.personLogout();
    }
}
