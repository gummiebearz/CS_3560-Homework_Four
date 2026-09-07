public class CargoShip extends Ship {
    private int cargoCapacity;

    public CargoShip(String name, String yearBuilt, int cargoCapacity) {
        super(name, yearBuilt);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return this.cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void print() {
        System.out.println("Name: " + super.getName() + " - Cargo Capacity: " + this.cargoCapacity);
    }
}
