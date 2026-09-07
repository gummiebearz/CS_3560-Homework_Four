public class Course {
  private String name;
  private Instructor[] instructors;
  private Textbook[] textbooks;

  // private Instructor instructor;
  // private Textbook textbook;

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
    System.out.println("Course name: " + this.name);
    for (Instructor instructor : this.instructors) {
      System.out.println(
          "Instructor: " + instructor.getFirstName() + " " + instructor.getLastName());
    }

    for (Textbook textbook : this.textbooks) {
      System.out.println(
          "Textbook: " + textbook.getTitle() + ", authored by " + textbook.getAuthor());
    }
  }
}
