package szurawski.devices;

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



    public void mute() {
        System.out.println("Phone muted!");
    }

    public void installAnApp(String app) {
        System.out.println("App: " + app + ", succesfully installed!");
    }

    @Override
    public void turnOn() {
        System.out.println("wciskam przycisk");
        System.out.println("czekam");
        System.out.println("czekam");
        System.out.println("czekam");
        System.out.println("widzę logo");
        System.out.println("czekam");
        System.out.println("działa");


    }

}
