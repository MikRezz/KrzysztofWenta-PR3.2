public interface carsell {
    public static void sell(Human seller, Human buyer, Double price) throws Exception {
        Car car = null;
        int carIndex = -1;
        for (int i = 0; i < seller.garage.length; i++) {
            if (seller.garage[i] != null) {
                car = seller.garage[i];
                carIndex = i;
                break;
            }
        }
        if (car == null) {
            throw new Exception("Sprzedawca nie posiada samochodu do sprzedania");
        }
        int emptySpotIndex = -1;
        for (int i = 0; i < buyer.garage.length; i++) {
            if (buyer.garage[i] == null) {
                emptySpotIndex = i;
                break;
            }
        }
        if (emptySpotIndex == -1) {
            throw new Exception("Kupujący nie posiada wolnego miejsca w garażu");
        }
        if (buyer.cash < price) {
            throw new Exception("Kupujący nie posiada wystarczającej ilości gotówki");
        }
        seller.garage[carIndex] = null;
        buyer.garage[emptySpotIndex] = car;
        buyer.cash -= price;
        seller.cash += price;
        System.out.println("Transakcja zakończyła się sukcesem: Sprzedawca sprzedał samochód kupującemu za " + price + " zł");
    }
}
