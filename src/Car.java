import devices.Device;

public class Car extends Device implements carsell {
    public Double millage;
    Integer price ;

    public Car(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.millage = 0.0;
    }

    @Override
    public void turnOn() {
        System.out.println("Silnik uruchomiony !");
    }
    void refuel(){

    }
}