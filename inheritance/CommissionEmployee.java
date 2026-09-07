public class CommissionEmployee extends Employee {
    private double commissionRate;
    private double grossSales; 

    public CommissionEmployee(String newFirstName, String newLastName, String newSocialSecurity, double newCommissionRate, double newGrossSales) {
        super(newFirstName, newLastName, newSocialSecurity);
        commissionRate = newCommissionRate;
        grossSales = newGrossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(double newCommissionRate) {
        commissionRate = newCommissionRate;
    }

    public void setGrossSales(double newGrossSales) {
        grossSales = newGrossSales;
    }

    public void display() {
        super.display();
        System.out.printf("    -> Commission Rate: %.0f%%\n", commissionRate * 100);
        System.out.printf("    -> Gross Sales: $%.0f\n", grossSales);
    }
}
