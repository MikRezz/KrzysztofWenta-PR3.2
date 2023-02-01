public class Animal implements salleable {
    String species;
    String name;
    Double weight;
    Boolean alive;
    Human owner;
    Double Price;

    public Animal(String species) {
        this.species = species;
        this.weight = 3.0;
        this.alive = true;
        this.name = "Bambo";
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.equals(buyer)) {
            System.out.println("Handel ludźmi jest niemożliwy.");}
        else if (seller == this.owner && seller.getSalary() > price) {
            this.owner = buyer;
            buyer.cash = buyer.cash - price;
            seller.cash = seller.cash + price;
            System.out.println("Tranzakcja pomyślna: " + buyer.getName() + " zakupił " + species + " od " + seller.getName() + " za $" + price);
        }

        else {
            System.out.println("Masz za mało pieniedzy lub zwierzak nalezy do kogos innego");
        }
        return false;
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