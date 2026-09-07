public class BaseEmployee extends Employee {
    private double baseSalary;

    public BaseEmployee(String newFirstName, String newLastName, String newSocialSecurity, double newBaseSalary) {
        super(newFirstName, newLastName, newSocialSecurity);
        baseSalary = newBaseSalary;
    }

    public void display() {
        super.display();
        System.out.printf("    -> Base Salary: $%.0f\n", baseSalary);
    }
}
