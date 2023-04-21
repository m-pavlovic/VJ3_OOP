import java.text.ParseException;

public class SportsCar extends Vehicle {

    public SportsCar(String brand, String model, String date) throws ParseException {
        super(brand, model);
        this.setDate(date);
        vehID = ++autoInc;
    }

    @Override
    public String toString() {
        return "SportsCar [brand=" + brand +
                ", model=" + model +
                ", date=" + dateFormat.format(date) +
                ", vehID=" + vehID + "]";
    }
}