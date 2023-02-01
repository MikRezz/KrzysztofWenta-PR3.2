import creatures.Edblie;

public class FarmAnimal extends Animal implements Edblie {
    public FarmAnimal(String species) {
        super(species);
    }

    @Override
    public void beEaten() {

    }
}
