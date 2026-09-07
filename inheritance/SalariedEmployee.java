public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String newFirstName, String newLastName, String newSocialSecurity, double newWeeklySalary) {
        super(newFirstName, newLastName, newSocialSecurity);
        weeklySalary = newWeeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double newWeeklySalary) {
        weeklySalary = newWeeklySalary;
    }

    public void display() {
        super.display();
        System.out.printf("    -> Weekly salary: $%.0f\n", weeklySalary);
    }
}
