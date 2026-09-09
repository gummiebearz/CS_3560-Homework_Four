public class CommissionEmployee extends Employee {
  private double commissionRate;
  private double grossSales;

  public CommissionEmployee(
      String firstName,
      String lastName,
      String socialSecurity,
      double commissionRate,
      double grossSales) {
    super(firstName, lastName, socialSecurity);
    this.commissionRate = commissionRate;
    this.grossSales = grossSales;
  }

  public double getCommissionRate() {
    return this.commissionRate;
  }

  public double getGrossSales() {
    return this.grossSales;
  }

  public void setCommissionRate(double commissionRate) {
    this.commissionRate = commissionRate;
  }

  public void setGrossSales(double grossSales) {
    this.grossSales = grossSales;
  }

  public void display() {
    super.display();
    System.out.printf("    -> Commission Rate: %.0f%%\n", this.commissionRate * 100);
    System.out.printf("    -> Gross Sales: $%.0f\n", this.grossSales);
  }
}
