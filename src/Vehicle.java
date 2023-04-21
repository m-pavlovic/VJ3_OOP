import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Vehicle {

    protected String brand;
    protected String model;
    protected SimpleDateFormat dateFormat;
    protected int vehID;
    protected static int autoInc = 300;
    Date date;

    {
        vehID = autoInc++;
    }

    public Vehicle() {

    }

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
        dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    }

    public void setDate(String productionDate) throws ParseException {
        date = dateFormat.parse(productionDate);
    }

    public void startVehicle() {
        System.out.println("Vehicle starting the engine!");
    }

    public void stopVehicle() {
        System.out.println("Vehicle stop the vehicle!");
    }

    public void turnOffEngine() {
        System.out.println("Vehicle turn off the engine!");
    }

    @Override
    public String toString() {
        return "Vehicle [brand=" + brand +
                ", model=" + model +
                ", date=" + dateFormat.format(date) +
                ", vehID=" + vehID + "]";
    }

    protected void vehInfo() {
        System.out.println(this);
    }

}
