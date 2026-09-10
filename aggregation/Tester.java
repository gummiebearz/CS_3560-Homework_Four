public class Tester {
  public static void main(String[] args) {
    System.out.println("AGGREGATION EXERCISE");
    System.out.println("====================");

    // One Instructor and One Textbook
    System.out.println("Case 1: One Instructor and One Textbook");
    System.out.println("---------------------------------------");

    Instructor instructor1 = new Instructor("Nima", "Davarpanah", "3-2636");

    Textbook textbook1 = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");

    Instructor[] oneInstructor = {instructor1};
    Textbook[] oneTextbook = {textbook1};

    Course course1 = new Course("CS3560", oneInstructor, oneTextbook);

    course1.print();

    System.out.println();
    // Two Instructors and Two Textbooks
    System.out.println("Case 2: Two Instructors and Two Textbooks");
    System.out.println("-----------------------------------------");

    Instructor instructor2 = new Instructor("Sarah", "Johnson", "4-1120");
    Textbook textbook2 = new Textbook("Effective Java", "Joshua Bloch", "Addison-Wesley");

    Instructor[] twoInstructors = {instructor1, instructor2};

    Textbook[] twoTextbooks = {textbook1, textbook2};

    Course course2 = new Course("CS3560-02", twoInstructors, twoTextbooks);
    course2.print();
  }
}
