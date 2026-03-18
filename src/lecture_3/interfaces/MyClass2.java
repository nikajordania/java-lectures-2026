package lecture_3.interfaces;

// MyClass2 uses the default print() without overriding — default method in action
public class MyClass2 implements MyInterface {

    @Override
    public void display() {
        System.out.println("MyClass2 display()");
    }

    // print() is NOT overridden here — the interface's default is used automatically

    @Override
    public Integer sum(Integer v1, Integer v2) {
        return v1 + v2;
    }
}
