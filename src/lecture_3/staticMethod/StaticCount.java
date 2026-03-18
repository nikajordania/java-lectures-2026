package lecture_3.staticMethod;

public class StaticCount {
    // Static variable — ONE copy shared across ALL instances
    public static int count = 0;

    public static void main(String[] args) {
        StaticCount sc1 = new StaticCount();
        StaticCount sc2 = new StaticCount();
        StaticCount sc3 = new StaticCount();

        // Changing via any instance changes the SAME variable
        sc1.count = 10;
        System.out.println("Count via sc1: " + sc1.count); // 10
        System.out.println("Count via sc2: " + sc2.count); // 10 — same variable!
        System.out.println("Count via sc3: " + sc3.count); // 10 — same variable!

        // Always prefer accessing static variables through the class name
        System.out.println("Preferred: " + StaticCount.count); // 10
    }
}
