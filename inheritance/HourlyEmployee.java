public class HourlyEmployee extends Employee {
  private double wage;
  private double hoursWorked;

  public HourlyEmployee(
      String firstName, String lastName, String socialSecurity, double wage, double hoursWorked) {
    super(firstName, lastName, socialSecurity);
    this.wage = wage;
    this.hoursWorked = hoursWorked;
  }

  public double getHourlyWage() {
    return this.wage;
  }

  public double getHoursWorked() {
    return this.hoursWorked;
  }

  public void setHourlyWage(double wage) {
    this.wage = wage;
  }

  public void setHoursWorked(double hoursWorked) {
    this.hoursWorked = hoursWorked;
  }

  public void display() {
    System.out.println("Hourly Employee:");
    System.out.println("----------------");
    super.display();
    System.out.printf("Hourly Wage: $%.0f\n", this.wage);
    System.out.printf("Hours Worked: %.0f\n", this.hoursWorked);
  }
}
