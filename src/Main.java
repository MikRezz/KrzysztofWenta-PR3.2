import devices.Car;

public class Main {
    public static void main(String[] args) {

        Animal panda = new Animal("canis");
        panda.feed();
        panda.takeForAWalk();
        panda.takeForAWalk();
        panda.takeForAWalk();
        panda.takeForAWalk();
        panda.takeForAWalk();
        panda.takeForAWalk();
        panda.takeForAWalk();
        panda.takeForAWalk();
        panda.feed();
        panda.feed();

//zad 2
        Car passat = new Car("vw","passerati",2001);

        System.out.println(passat.producer);
        System.out.println(passat.model);
        System.out.println(passat.yearOfProduction);
        System.out.println(passat.millage);


//zad 3 i 4
Human sal = new Human();
        System.out.println("Twoja wyplata to : "+ sal.getSalary());
        sal.setSalary(5000.0);

//zad 6
        System.out.println(new Car("vw", "pasiak", 1998)
                .equals(new Car("Fiat","doblo",2000)));
        System.out.println(new Car("Fiat", "doblo", 2000)
                .equals(new Car("Fiat","doblo",2000)));

        Car car1 = new Car("vw","pasat",2000);
        System.out.println(car1);

        Human human1 = new Human();
        human1.name = "Henio"; human1.pet = panda;
        System.out.println(human1);

        //zad 8
        Human seller = new Human();
        seller.name = "Andrzej";
        seller.cash = 1000.0;
        Human buyer = new Human();
        buyer.name = "Zdzichu";
        buyer.cash = 1000.0;
        Animal Reksio = new Animal("canis");
        Reksio.Price = 300.0;
        if (Reksio.sell(seller,buyer, Reksio.Price)){
            System.out.println("Transakcja przebiegła pomyślnie.");
            System.out.println(buyer.getName() + " kupił od " + seller.getName() + " psa " + Reksio.name + " za cenę " + Reksio.Price + ".");
        }


    }
}