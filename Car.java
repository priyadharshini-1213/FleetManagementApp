package fleet;
public class Car extends Vehicle {
    public Car(String regNo, double odometer, String status, String lastServiceDate) {
        super(regNo, "Car", odometer, status, lastServiceDate);
    }

    @Override
    public double nextServiceDue() {
        return 10000 - odometer % 10000;
    }

    @Override
    public double operatingCostPerKm() {
        return 2.0;
    }
}
