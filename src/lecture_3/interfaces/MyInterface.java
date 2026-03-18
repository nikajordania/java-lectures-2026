package lecture_3.interfaces;

public interface MyInterface {
    // Abstract method — every implementing class MUST provide its own version
    void display();

    // Default method — provides a fallback; implementing class can override or keep it
    default void print() {
        System.out.println("[Default] No custom print defined.");
    }

    // Abstract method — must be implemented
    Integer sum(Integer v1, Integer v2);

    // Static method — belongs to the interface itself; called via MyInterface.info()
    static void info() {
        System.out.println("MyInterface: demonstrates abstract, default, and static methods.");
    }
}
