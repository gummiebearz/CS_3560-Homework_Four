public class Course {
  private String name;
  private Instructor[] instructors;
  private Textbook[] textbooks;

  public Course(String name, Instructor[] instructors, Textbook[] textbooks) {
    this.name = name;
    this.instructors = instructors;
    this.textbooks = textbooks;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void print() {
    System.out.printf("Course: %s%n%n", this.name);

    int noCounter = 0;

    System.out.println("Instructor(s):");
    for (Instructor instructor : this.instructors) {
      System.out.println(
          (noCounter + 1)
              + ". Instructor: "
              + instructor.getFirstName()
              + " "
              + instructor.getLastName());

      System.out.println("   Office: " + instructor.getOfficeNumber());

      noCounter++;
    }

    System.out.println();
    noCounter = 0;

    System.out.println("Textbook(s):");
    for (Textbook textbook : this.textbooks) {
      System.out.println((noCounter + 1) + ". " + textbook.getTitle());
      System.out.println("   Author: " + textbook.getAuthor());
      System.out.println("   Publisher: " + textbook.getPublisher());

      noCounter++;
    }
  }
}
