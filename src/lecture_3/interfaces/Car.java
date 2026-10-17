package lecture_3.interfaces;

// Car implements TWO interfaces — Java supports multiple interface implementation
public class Car implements Vehicle, TurboBoost {

    private String model;

    public Car(String model) {
        this.model = model;
    }

    // From Vehicle
    @Override
    public void start() {
        System.out.println(model + " engine started.");
    }

    // From Vehicle
    @Override
    public void stop() {
        System.out.println(model + " engine stopped.");
    }

    // From TurboBoost — only Car has this extra capability
    @Override
    public void boost() {
        System.out.println(model + " turbo boost activated!");
    }

    public static void main(String[] args) {
        Car car = new Car("Tesla");
        car.start();
        car.boost();
        car.stop();

        // A Car object can be referenced as Vehicle OR TurboBoost
        Vehicle v = new Car("BMW");
        v.start(); // only Vehicle methods accessible here
    }
}