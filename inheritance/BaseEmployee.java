public class BaseEmployee extends Employee {
  private double baseSalary;

  public BaseEmployee(String firstName, String lastName, String socialSecurity, double baseSalary) {
    super(firstName, lastName, socialSecurity);
    this.baseSalary = baseSalary;
  }

  public double getBaseSalary() {
    return this.baseSalary;
  }

  public void setBaseSalary(double baseSalary) {
    this.baseSalary = baseSalary;
  }

  public void display() {
    System.out.println("Base Employee:");
    System.out.println("--------------");

    super.display();
    System.out.printf("Base Salary: $%.0f\n", this.baseSalary);
  }
}
