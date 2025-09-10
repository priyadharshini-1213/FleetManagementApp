package fleet;
public class Truck extends Vehicle {
    public Truck(String regNo, double odometer, String status, String lastServiceDate) {
        super(regNo, "Truck", odometer, status, lastServiceDate);
    }

    @Override
    public double nextServiceDue() {
        return 5000 - odometer % 5000;
    }

    @Override
    public double operatingCostPerKm() {
        return 5.0;
    }
}
