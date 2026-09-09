public class CruiseShip extends Ship {
  private int maxPassengers;

  public CruiseShip(String name, String yearBuilt, int maxPassengers) {
    super(name, yearBuilt);
    this.maxPassengers = maxPassengers;
  }

  public int getMaxPassengers() {
    return this.maxPassengers;
  }

  public void setMaxPassengers(int maxPassengers) {
    this.maxPassengers = maxPassengers;
  }

  @Override
  public void print() {
    System.out.println("Cruise Ship:");
    System.out.println("-----------");

    System.out.println("Name: " + super.getName());
    System.out.println("Max Passengers: " + this.maxPassengers);
  }
}
