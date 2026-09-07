
public class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurity;

    public Employee(String newFirstName, String newLastName, String newSocialSecurity) {
        firstName = newFirstName;
        lastName = newLastName;
        socialSecurity = newSocialSecurity;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurity() {
        return socialSecurity;
    }

    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }

    public void setLastName(String newLastName) {
        lastName = newLastName;
    }

    public void setSocialSecurity(String newSocialSecurity) {
        socialSecurity = newSocialSecurity;
    }

    public void display() {
        System.out.println(firstName + " " + lastName + " [" + socialSecurity + "]");
    }
}
