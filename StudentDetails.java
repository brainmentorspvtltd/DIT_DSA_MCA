public class StudentDetails {
    int rollNo;
    String name;
    String course;
    double fees;
    String collegeName;

    // Default Constructor
    // What is Constructor ? 
    // - it is called when we create object of class
    // Why we need Constructor ? 
    // it is used to initialize instance variables
    public StudentDetails() {
        this.collegeName = "DIT";
    }

    // Parameterized Constructor
    public StudentDetails(int rollNo, String name, String course, double fees) {
        // constructor chaining
        this();     // it will call default const.
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
        this.fees = fees;
    }

    void showDetails() {
        System.out.println("College : " + this.collegeName);
        System.out.println("RollNo : " + this.rollNo);
        System.out.println("Name : " + name);
        System.out.println("Course : " + course);
        System.out.println("Fees : " + fees);
    }
}
