package fleet;
public class ServiceRecord {
    private static int idCounter = 1;
    private int recordId;
    private Vehicle vehicle;
    private String serviceType;
    private double cost;
    private String date;
    private String notes;

    public ServiceRecord(Vehicle vehicle, String serviceType, double cost, String date, String notes) {
        this.recordId = idCounter++;
        this.vehicle = vehicle;
        this.serviceType = serviceType;
        this.cost = cost;
        this.date = date;
        this.notes = notes;
    }

    public int getRecordId() {
        return recordId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public String getServiceType() {
        return serviceType;
    }

    public double getCost() {
        return cost;
    }

    public String getDate() {
        return date;
    }

    public String getNotes() {
        return notes;
    }

    @Override
    public String toString() {
        return "ServiceRecord{" +
                "recordId=" + recordId +
                ", vehicle=" + vehicle.getRegNo() +
                ", serviceType='" + serviceType + '\'' +
                ", cost=" + cost +
                ", date='" + date + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}
