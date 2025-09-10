package fleet;
public class FleetAppMain {
    public static void main(String[] args) {
        FleetService fleetService = new FleetService();

        // Register vehicles
        Truck truck = new Truck("TRK123", 12000, "Active", "2025-01-10");
        Car car = new Car("CAR456", 5000, "Active", "2025-02-15");
        Bike bike = new Bike("BIK789", 1500, "Active", "2025-03-01");

        fleetService.addVehicle(truck);
        fleetService.addVehicle(car);
        fleetService.addVehicle(bike);

        // Add service records
        ServiceRecord sr1 = new ServiceRecord(truck, "Engine Overhaul", 1500, "2025-04-01", "Heavy load usage");
        ServiceRecord sr2 = new ServiceRecord(car, "Oil Change", 300, "2025-05-01", "Routine maintenance");
        fleetService.addService(sr1);
        fleetService.addService(sr2);

        // Add fuel entries
        FuelEntry fe1 = new FuelEntry(truck, 100, 1.2, 12100, "FuelStation A");
        FuelEntry fe2 = new FuelEntry(car, 40, 1.1, 5100, "FuelStation B");
        FuelEntry fe3 = new FuelEntry(bike, 10, 1.0, 1600, "FuelStation C");
        fleetService.addFuel(fe1);
        fleetService.addFuel(fe2);
        fleetService.addFuel(fe3);

        // Print reports
        fleetService.printReports();
    }
}
