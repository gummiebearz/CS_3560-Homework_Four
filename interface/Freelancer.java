public class Freelancer implements Payable {
    private String firstName;
    private String lastName;
    private double hourlyRate;
    private double hoursWorked;

    public Freelancer(String newFirstName, String newLastName, double newHourlyRate, double newHoursWorked) {
        firstName = newFirstName;
        lastName = newLastName;
        hourlyRate = newHourlyRate > 0 ? newHourlyRate : 0;
        hoursWorked = newHoursWorked > 0 ? newHoursWorked: 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }

    public void setLastName(String newLastName) {
        lastName = newLastName;
    }

    public void setHourlyRate(double newHourlyRate) {
        if(newHourlyRate < 0) {
            throw new IllegalArgumentException("Rate must be non-negative");
        } 

        hourlyRate = newHourlyRate;
    }

    public void setHoursWorked(double newHoursWorked) {
        if(newHoursWorked < 0) {
            throw new IllegalArgumentException("Hours worked must be non-negative");
        } 

        hoursWorked = newHoursWorked;
    }

    public double calculatePayment() {
        double payment = 0;

        if(hoursWorked <= 40) {
            payment = hourlyRate * hoursWorked;
        } else {
            double regularPayment = 40 * hourlyRate;
            double overtimePayment = (hoursWorked - 40) * (hourlyRate * 1.5); 
            payment = regularPayment + overtimePayment;
        }

        return payment;
    }

    public String getPayeeName() {
        return firstName + ", " + lastName;
    }

    public void print() {
        System.out.println(getPayeeName());
        System.out.printf("    -> Payment: $%.2f\n", calculatePayment());
    }
}
