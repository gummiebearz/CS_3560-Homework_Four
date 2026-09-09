public class SalariedEmployee extends Employee {
  private double weeklySalary;

  public SalariedEmployee(
      String firstName, String lastName, String socialSecurity, double weeklySalary) {
    super(firstName, lastName, socialSecurity);
    this.weeklySalary = weeklySalary;
  }

  public double getWeeklySalary() {
    return this.weeklySalary;
  }

  public void setWeeklySalary(double weeklySalary) {
    this.weeklySalary = weeklySalary;
  }

  public void display() {
    System.out.println("Salaried Employee:");
    System.out.println("------------------");

    super.display();
    System.out.printf("Weekly salary: $%.0f\n", this.weeklySalary);
  }
}
