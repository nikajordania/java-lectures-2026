package lecture_3.staticMethod;

import java.util.logging.Logger;

public class Car {
    // Static variable — shared by ALL instances (tracks how many Car objects exist)
    public static int count = 0;

    // Instance variable — unique to each Car object
    public String model;

    // Static constant — fixed value, belongs to the class (not per-object)
    public static final String MANUFACTURER = "Generic Motors";

    // Static logger — one shared instance for the whole class (common pattern)
    static final Logger logger = Logger.getLogger(Car.class.getName());

    // Static block — runs ONCE when the class is first loaded, before any object is created
    static {
        System.out.println("Car class loaded. Manufacturer: " + MANUFACTURER);
    }

    public Car(String model) {
        this.model = model;
        count++;
        System.out.println("Created car: " + model + " | Total cars: " + count);
    }

    // Static method — can only access static members (count, MANUFACTURER)
    public static void showStats() {
        System.out.println("Total cars created: " + count + " | Manufacturer: " + MANUFACTURER);
    }
}
