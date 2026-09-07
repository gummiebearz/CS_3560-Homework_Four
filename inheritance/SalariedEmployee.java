public class SalariedEmployee extends Employee {
    private int weeklySalary;

    public SalariedEmployee(String newFirstName, String newLastName, String newSocialSecurity, int newWeeklySalary) {
        super(newFirstName, newLastName, newSocialSecurity);
        weeklySalary = newWeeklySalary;
    }

    public int getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(int newWeeklySalary) {
        weeklySalary = newWeeklySalary;
    }

    public void display() {
        super.display();
        System.out.println("    -> Weekly salary: $" + weeklySalary);
    }
}
