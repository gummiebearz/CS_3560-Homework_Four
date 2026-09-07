public class Tester {
  public static void main(String[] args) {
    Instructor instructor = new Instructor("Nima", "Davarpanah", "3-2636");
    Textbook textbook = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");

    Course course = new Course("CS3560", instructor, textbook);
    course.print();
  }
}
