public class StudentCaller {
    public static void main(String[] args) {

        // will call default constructor

        // will call param constructor
        StudentDetails ram = new StudentDetails(101, "Ram", "Btech", 50000.00);
        // ram.takeInput(101, "Ram", "Btech", 50000.00);
        ram.showDetails();

        StudentDetails shyam = new StudentDetails(102, "Shyam", "Btech", 50000.00);
        // shyam.takeInput(102, "Shyam", "Btech", 50000.00);
        shyam.showDetails();
    }
}
