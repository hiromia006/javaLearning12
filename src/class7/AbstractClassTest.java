package class7;

public class AbstractClassTest {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start(); // Outputs: Car starts with a key.
        myCar.breakCar();// Outputs: Car is braking.
        myCar.stop();  // Outputs: Vehicle stopped.



        Vehicle myVehicle = new Car();
        myVehicle.start(); // Outputs: Car starts with a key.
        myVehicle.stop();  // Outputs: Vehicle stopped.
        // myVehicle.breakCar(); // This line would cause a compile-time error
    }
}
