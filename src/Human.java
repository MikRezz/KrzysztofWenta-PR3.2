public class Human {
    String name;
    Animal pet;
    private Car car;

    private Double Salary = 0.0 ;
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

    public void setCar(Car car) {
        this.car = car;
    }
}
