public class Tester {
  public static void main(String[] args) {
    /* // One Instructor and One Textbook
    Instructor instructor = new Instructor("Nima", "Davarpanah", "3-2636");
    Textbook textbook = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");

    Course course = new Course("CS3560", instructor, textbook);
    course.print(); */

    // Two Instructors and Two Textbooks
    Instructor[] instructors = new Instructor[2];

    instructors[0] = new Instructor("Nima", "Davarpanah", "3-2636");
    instructors[1] = new Instructor("Sarah", "Johnson", "4-1120");

    Textbook[] textbooks = new Textbook[2];
    textbooks[0] = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
    textbooks[1] = new Textbook("Effective Java", "Joshua Bloch", "Addision-Wesley");

    Course course = new Course("CS3560", instructors, textbooks);
    course.print();
  }
}
