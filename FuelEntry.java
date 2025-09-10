package fleet;
public class FuelEntry {
    private static int idCounter = 1;
    private int entryId;
    private Vehicle vehicle;
    private double liters;
    private double pricePerLiter;
    private double odometer;
    private String station;

    public FuelEntry(Vehicle vehicle, double liters, double pricePerLiter, double odometer, String station) {
        this.entryId = idCounter++;
        this.vehicle = vehicle;
        this.liters = liters;
        this.pricePerLiter = pricePerLiter;
        this.odometer = odometer;
        this.station = station;
    }

    public int getEntryId() {
        return entryId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public double getLiters() {
        return liters;
    }

    public double getPricePerLiter() {
        return pricePerLiter;
    }

    public double getOdometer() {
        return odometer;
    }

    public String getStation() {
        return station;
    }

    public double totalAmount() {
        return liters * pricePerLiter;
    }

    @Override
    public String toString() {
        return "FuelEntry{" +
                "entryId=" + entryId +
                ", vehicle=" + vehicle.getRegNo() +
                ", liters=" + liters +
                ", pricePerLiter=" + pricePerLiter +
                ", odometer=" + odometer +
                ", station='" + station + '\'' +
                '}';
    }
}
