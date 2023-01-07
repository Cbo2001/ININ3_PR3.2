package devices;

public class Car extends Device{

    String fuelType;
    public Double millage;

    String color;
    public Double value;

    public Car(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.millage = 0.0;
    }

    public void drive() {
        this.millage += 10.0;
        System.out.println("\nAktualny przebieg to: " + this.millage);
    }

    public String toString() {
        return producer + " " + model + " " + yearOfProduction + " " + millage + " "+ color + " "+ fuelType + " "   + value;
    }
}
