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
    }


}