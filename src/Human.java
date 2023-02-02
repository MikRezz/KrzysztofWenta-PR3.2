import java.util.Arrays;
import java.util.Comparator;

public class Human {
    String name;
    Animal pet;
    private Car car;
    Car[] garage;
    Double cash;

    private Double Salary = 0.0 ;

    public Human(String name, Double cash, int defaultGarageSize) {
        this.name = name;
        this.cash = cash;
        this.garage = new Car[defaultGarageSize];
    }

    public Human(String name, Car[] garage, int garageSize) {
        this.name = name;
        this.garage = new Car[garageSize];
    }
    public Car getCar(int parkingSpot) {
        return garage[parkingSpot];
    }

    public void setCar(int parkingSpot, Car car) {
        garage[parkingSpot] = car;
    }
    public double calculateGarageValue() {
        double sum = 0;
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] != null) {
                sum += garage[i].value;
            }
        }
        return sum;
    }

    public void sortCarsByYear() {
        Arrays.sort(garage, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return Integer.compare(car1.getYearOfProduction(), car2.getYearOfProduction());
            }
        });
    }
    public String getName() {
        return name;
    }

    public Car[] getGarage() {
        return garage;
    }

    public Double getSalary()
    {
        return this.Salary;
    }
    public void setSalary(Double salary)
    {
        if( salary > 0)
        {
            this.Salary = salary;
            System.out.println("-------------------------------------------------------------------- " );
            System.out.println("Twoja wypłata została zmieniona  na " + salary);
            System.out.println("-> nowe dane zostały wysłane do systemu księgowego");
            System.out.println("-> koniecznie odbierz aneks do umowy od pani Hani z kadr");
            System.out.println("-> ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu");
            System.out.println("-------------------------------------------------------------------- " );
        }
        else
        {
            System.out.println("Podaj poprawną wartość !");
        }
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car, int carPrice) {
        if (getSalary() > carPrice) {
            System.out.println("Udało się kupić za gotówkę");
            this.car = car;
        } else if (getSalary() > carPrice / 12) {
            System.out.println("Udało się kupić na kredyt (no trudno)");
            this.car = car;
        } else {
            System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
        }
    }
    public String toString(){
        return name +" "+ Salary +" "+ car;
    }
}
