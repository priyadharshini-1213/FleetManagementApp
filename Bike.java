package fleet;
public class Bike extends Vehicle {
    public Bike(String regNo, double odometer, String status, String lastServiceDate) {
        super(regNo, "Bike", odometer, status, lastServiceDate);
    }

    @Override
    public double nextServiceDue() {
        return 2000 - odometer % 2000;
    }

    @Override
    public double operatingCostPerKm() {
        return 0.5;
    }
}
