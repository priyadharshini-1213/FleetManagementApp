package fleet;
public abstract class Vehicle {
    protected String regNo;
    protected String type;
    protected double odometer;
    protected String status;
    protected String lastServiceDate;

    public Vehicle(String regNo, String type, double odometer, String status, String lastServiceDate) {
        this.regNo = regNo;
        this.type = type;
        this.odometer = odometer;
        this.status = status;
        this.lastServiceDate = lastServiceDate;
    }

    public String getRegNo() {
        return regNo;
    }

    public String getType() {
        return type;
    }

    public double getOdometer() {
        return odometer;
    }

    public void updateOdometer(double distance) {
        if(distance > 0) {
            odometer += distance;
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLastServiceDate() {
        return lastServiceDate;
    }

    public void setLastServiceDate(String lastServiceDate) {
        this.lastServiceDate = lastServiceDate;
    }

    public abstract double nextServiceDue();

    public abstract double operatingCostPerKm();
}
