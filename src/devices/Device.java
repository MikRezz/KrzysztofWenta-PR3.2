package devices;

public abstract class Device {
    public String producer;
    public String model;
    public Integer yearOfProduction;
    public Integer value;

    @Override
    public String toString() {
        return producer + " " + model + " " +yearOfProduction;
    }

    public Integer getYearOfProduction() {
        return yearOfProduction;
    }

    public abstract void turnOn();
}
