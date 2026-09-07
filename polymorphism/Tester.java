public class Tester {
    public static void main(String[] args) {
        Ship[] ships = new Ship[3];

        ships[0] = new Ship("Astronomy", "1999");
        ships[1] = new CruiseShip("Princess", "2009", 300);
        ships[2] = new CargoShip("Zim Rotterdam", "2019", 3000);

        for(Ship s : ships) {
            s.print();
        }
    }
}
