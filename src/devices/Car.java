package devices;

public class Car extends Device{

    String fuelType;
    public Double millage;

    String color;
    public Double value;

    public Car(String producer, String model, Integer yearOfProduction) {
        super(model, producer, yearOfProduction);

        this.millage = 0.0;
    }

    @Override
    public void turnOn() {
        System.out.println("przekręcam kluczyk");
        System.out.println("czekam");
        System.out.println("modlę się w intencji akumulatora");
        System.out.println("odpala");



    }

    public void drive() {
        this.millage += 10.0;
        System.out.println("\nAktualny przebieg to: " + this.millage);
    }

    @Override
    public String toString() {
        return "Car{" +
                "fuelType='" + fuelType + '\'' +
                ", millage=" + millage +
                ", color='" + color + '\'' +
                ", value=" + value +
                ", model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
