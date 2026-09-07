public class HourlyEmployee extends Employee {
    private double wage;
    private double hoursWorked;

    public HourlyEmployee(String newFirstName, String newLastName, String newSocialSecurity, double newWage, double newHoursWorked) {
        super(newFirstName, newLastName, newSocialSecurity);
        wage = newWage;
        hoursWorked = newHoursWorked;
    }

    public double getHourlyWage() {
        return wage;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHourlyWage(double newWage) {
        wage = newWage;
    }

    public void setHoursWorked(double newHoursWorked) {
        hoursWorked = newHoursWorked;
    }

    public void display() {
        super.display();
        System.out.printf("    -> Hourly Wage: $%.0f\n", wage);
        System.out.printf("    -> Hours Worked: %.0f\n", hoursWorked);
    }
}
