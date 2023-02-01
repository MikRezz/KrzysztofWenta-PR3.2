package devices;

public abstract class Device {
    public String producer;
    public String model;
    public Integer yearOfProduction;

    @Override
    public String toString() {
        return producer + " " + model + " " +yearOfProduction;
    }
    public abstract void turnOn();
}
