public class Car {
    public String producer;
    public String model;
    public Integer yearOfProduction;
    public Double millage;

    public Car(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.millage = 0.0;
    }
}