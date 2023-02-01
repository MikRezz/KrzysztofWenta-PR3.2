import devices.Car;

public class Human {
    String name;
    Animal pet;
    private Car car;
    Double cash;

    private Double Salary = 0.0 ;

    public String getName() {
        return name;
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
