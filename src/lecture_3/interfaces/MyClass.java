package lecture_3.interfaces;

public class MyClass implements MyInterface {

    @Override
    public void display() {
        System.out.println("MyClass display()");
    }

    // Overriding the default method and calling the interface's version first
    @Override
    public void print() {
        MyInterface.super.print(); // calls the interface default
        System.out.println("MyClass adds its own print logic.");
    }

    @Override
    public Integer sum(Integer v1, Integer v2) {
        return v1 + v2;
    }

    public static void main(String[] args) {
        // Static interface method — called on the interface, not on an instance
        MyInterface.info();

        MyClass obj = new MyClass();
        obj.display();
        obj.print();
        System.out.println("Sum: " + obj.sum(3, 4)); // 7
    }
}

