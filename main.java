public class main {
    public static void main(String[] args) {
        Market market = new Market();
        Human hum1 = new Human("Вадим");
        Human hum2 = new Human("Артем");
        market.acceptToMarket(hum1);
        market.update();
    }
}
