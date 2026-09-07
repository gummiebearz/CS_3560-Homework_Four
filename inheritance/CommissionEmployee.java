public class CommissionEmployee extends Employee {
    private double rate;
    private double grossSales; 

    public CommissionEmployee(String newFirstName, String newLastName, String newSocialSecurity, double newRate, double newGrossSales) {
        super(newFirstName, newLastName, newSocialSecurity);
        rate = newRate;
        grossSales = newGrossSales;
    }

    public void display() {
        super.display();
        System.out.printf("    -> Commission Rate: %.0f%%\n", rate * 100);
        System.out.printf("    -> Gross Sales: $%.0f\n", grossSales);
    }
}
