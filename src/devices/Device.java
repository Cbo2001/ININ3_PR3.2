package devices;

import java.util.zip.DataFormatException;

public class Device {
    String model;
    String producer;
    Integer yearOfProduction;

    public String toString() {
        return producer + " " + model + " " + yearOfProduction;
    }
}
