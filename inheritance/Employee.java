public class Employee {
  private String firstName;
  private String lastName;
  private String socialSecurity;

  public Employee(String firstName, String lastName, String socialSecurity) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.socialSecurity = socialSecurity;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public String getSocialSecurity() {
    return this.socialSecurity;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setSocialSecurity(String socialSecurity) {
    this.socialSecurity = socialSecurity;
  }

  public void display() {
    System.out.println("Name: " + this.firstName + " " + this.lastName);
    System.out.println("SSN: " + this.socialSecurity);
  }
}
