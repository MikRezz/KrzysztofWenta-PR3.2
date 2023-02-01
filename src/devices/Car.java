package devices;

public class Car extends Device {
    public Double millage;
    int price ;

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
}