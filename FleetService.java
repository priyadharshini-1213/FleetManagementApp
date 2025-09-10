package fleet;
import java.util.*;

public class FleetService {
    private List<Vehicle> vehicles = new ArrayList<>();
    private List<ServiceRecord> serviceRecords = new ArrayList<>();
    private List<FuelEntry> fuelEntries = new ArrayList<>();

    public void addVehicle(Vehicle v) {
        vehicles.add(v);
        System.out.println("Added vehicle: " + v.getRegNo());
    }

    public void addService(ServiceRecord sr) {
        serviceRecords.add(sr);
        System.out.println("Added service record: " + sr.getRecordId());
    }

    public void addFuel(FuelEntry fe) {
        fuelEntries.add(fe);
        System.out.println("Added fuel entry: " + fe.getEntryId());
    }

    public void printReports() {
        System.out.println("\n=== Fleet Reports ===");
        for (Vehicle v : vehicles) {
            System.out.println("Vehicle: " + v.getRegNo() + ", Type: " + v.getType() +
                    ", Odometer: " + v.getOdometer() +
                    ", Next Service Due: " + v.nextServiceDue() +
                    ", Operating Cost per Km: " + v.operatingCostPerKm());
        }

        System.out.println("\n=== Service Records ===");
        for (ServiceRecord sr : serviceRecords) {
            System.out.println(sr);
        }

        System.out.println("\n=== Fuel Entries ===");
        for (FuelEntry fe : fuelEntries) {
            System.out.println(fe + ", Total Amount: " + fe.totalAmount());
        }
    }
}
