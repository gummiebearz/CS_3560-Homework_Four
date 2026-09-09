public class Freelancer implements Payable {
  private String firstName;
  private String lastName;
  private double hourlyRate;
  private double hoursWorked;

  public Freelancer(String firstName, String lastName, double hourlyRate, double hoursWorked) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.setHourlyRate(hourlyRate);
    this.setHoursWorked(hoursWorked);
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public double getHourlyRate() {
    return this.hourlyRate;
  }

  public double getHoursWorked() {
    return this.hoursWorked;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setHourlyRate(double newHourlyRate) {
    if (newHourlyRate < 0) {
      throw new IllegalArgumentException("Rate must be non-negative");
    }

    this.hourlyRate = newHourlyRate;
  }

  public void setHoursWorked(double newHoursWorked) {
    if (newHoursWorked < 0) {
      throw new IllegalArgumentException("Hours worked must be non-negative");
    }

    this.hoursWorked = newHoursWorked;
  }

  @Override
  public double calculatePayment() {
    double payment = 0;

    if (this.hoursWorked <= 40) {
      payment = this.hourlyRate * this.hoursWorked;
    } else {
      double regularPayment = 40 * this.hourlyRate;
      double overtimePayment = (this.hoursWorked - 40) * (this.hourlyRate * 1.5);
      payment = regularPayment + overtimePayment;
    }

    return payment;
  }

  @Override
  public String getPayeeName() {
    return this.firstName + " " + this.lastName;
  }

  @Override
  public void print() {
    System.out.println("Freelancer:");
    System.out.println("-----------");

    System.out.println("Payee: " + this.firstName + " " + this.lastName);
    System.out.printf("Payment: $%.2f\n", this.calculatePayment());
  }
}
