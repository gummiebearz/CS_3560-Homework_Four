public class Course {
  private String name;
  private Instructor instructor;
  private Textbook textbook;

  public Course(String name, Instructor instructor, Textbook textbook) {
    this.name = name;
    this.instructor = instructor;
    this.textbook = textbook;
  }

  public String getName() {
    return this.name;
  }

  public void print() {
    System.out.println("Course name: " + this.name);
    System.out.println(
        "Instructor name: " + instructor.getFirstName() + " " + instructor.getLastName());
    System.out.println(
        "Textbook title: " + textbook.getTitle() + ", authored by " + textbook.getAuthor());
  }
}
