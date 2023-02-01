public class Animal {
    String species;
    String name;
    Double weight;
    Boolean alive;

    public Animal(String species) {
        this.species = species;
        this.weight = 3.0;
        this.alive = true;
        this.name = "Bambo";
    }

    public void  feed()
    {
        if(this.alive == true && this.weight > 0.5)
        {
            this.weight += 0.5;
            System.out.println("dzieki za jedzenie"+ this.weight);
        }
        else
        {
            System.out.println("Za późno, zwierzak juz nie żyje !");
        }

    }
    public void takeForAWalk(){
        if(this.alive = true && this.weight > 0.5)
        {
            this.weight -= 0.5;
            System.out.println("dzieki za spacer" + this.weight);
        }
        else
        {
            System.out.println("zdechł");
        }

    }
}