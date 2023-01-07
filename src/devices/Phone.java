package devices;

public class Phone extends Device{


    String screenSize;
    String OS;

    @Override
    public String toString() {
        return "Phone{" +
                "screenSize='" + screenSize + '\'' +
                ", OS='" + OS + '\'' +
                ", model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    public Phone(String model, String producer, Integer yearOfProduction, String screenSize, String OS) {
        super(model, producer, yearOfProduction);
        this.screenSize = screenSize;
        this.OS = OS;
    }

    public void turnOn() {
        System.out.println("Turning on phone...1%...30%...80%...99%...Phone ready!");
    }

    public void mute() {
        System.out.println("Phone muted!");
    }

    public void installAnApp(String app) {
        System.out.println("App: " + app + ", succesfully installed!");
    }
}
