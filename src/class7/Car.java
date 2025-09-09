package class7;

public class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car starts with a key.");
    }

    public void breakCar() {
        System.out.println("Car is braking.");
    }
}
