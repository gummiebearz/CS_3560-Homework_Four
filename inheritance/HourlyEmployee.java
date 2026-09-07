public class HourlyEmployee extends Employee {
    private int hourlyWage;
    private int hoursWorked;

    public HourlyEmployee(String newFirstName, String newLastName, String newSocialSecurity, int newHourlyWage, int newHoursWorked) {
        super(newFirstName, newLastName, newSocialSecurity);
        hourlyWage = newHourlyWage;
        hoursWorked = newHoursWorked;
    }

    public void display() {
        super.display();
        System.out.println("    -> Hourly Wage: $" + hourlyWage);
        System.out.println("    -> Hours Worked: " + hoursWorked);
    }
}
