// S.O.L.I.D
// DRY - Don't Repeat Yourself
// SRP - Single Responsibility Principle
// Encapsulation - Binding data and methods in a single unit known as class

class Student {
    // Instance Variable
    int rollNo;
    String name;
    String course;
    double fees;
    String collegeName;
    // Student stu = new Student();

    void takeInput(int rollNo, String name, String course, double fees) {
        // this.instance_variable = Local Variable
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
        this.fees = fees;
    }

    void showDetails() {
        // java internally uses this
        // this.rollNo
        // this.name
        // this - used to refer current object
        System.out.println("RollNo : " + this.rollNo);
        System.out.println("Name : " + name);
        System.out.println("Course : " + course);
        System.out.println("Fees : " + fees);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student ram = new Student();
        // ram.stu.fees
        // ram.rollNo = 101;
        // ram.name = "Ram";
        // ram.course = "Btech";
        // ram.fees = 50000.00;
        ram.takeInput(101, "Ram", "Btech", 50000.00);
        ram.showDetails();
        // System.out.println("RollNo : " + ram.rollNo);
        // System.out.println("Name : " + ram.name);
        // System.out.println("Course : " + ram.course);
        // System.out.println("Fees : " + ram.fees);

        System.out.println("===================");

        Student shyam = new Student();
        // shyam.rollNo = 101;
        // shyam.name = "Ram";
        // shyam.course = "Btech";
        // shyam.fees = 50000.00;
        shyam.takeInput(102, "Shyam", "Btech", 50000.00);
        shyam.showDetails();
        // System.out.println("RollNo : " + shyam.rollNo);
        // System.out.println("Name : " + shyam.name);
        // System.out.println("Course : " + shyam.course);
        // System.out.println("Fees : " + shyam.fees);
    }
}
