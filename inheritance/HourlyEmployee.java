public class HourlyEmployee extends Employee {
    private double wage;
    private int hoursWorked;

    public HourlyEmployee(String newFirstName, String newLastName, String newSocialSecurity, double newWage, int newHoursWorked) {
        super(newFirstName, newLastName, newSocialSecurity);
        wage = newWage;
        hoursWorked = newHoursWorked;
    }

    public double getHourlyWage() {
        return wage;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHourlyWage(double newWage) {
        wage = newWage;
    }

    public void setHoursWorked(int newHoursWorked) {
        hoursWorked = newHoursWorked;
    }

    public void display() {
        super.display();
        System.out.printf("    -> Hourly Wage: $%.0f\n", wage);
        System.out.println("    -> Hours Worked: " + hoursWorked);
    }
}
