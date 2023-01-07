package devices;

public class Phone extends Device{


    String screenSize;
    String OS;

    public String toString() {
        return producer + " " + model + " " + screenSize + " " + OS;
    }

    public Phone(String producer, String model, String screenSize, String OS) {
        this.producer = producer;
        this.model = model;
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
