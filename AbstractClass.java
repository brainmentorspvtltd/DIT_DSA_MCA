abstract class Loan {
    void applyForLoan() {
        System.out.println("Apply for loan...");
    }
    abstract void emi();
}

class HomeLoan extends Loan {
    double interest = 10.00;

    void emi() {

    }
}

class EduLoan extends Loan {
    double interest = 11.5;
    @Override
    void emi() {
        
    }
}

class PersonalLoan extends Loan {
    double interest = 8.5;
    @Override
    void emi() {
        
    }
}

// class AutoLoan extends Loan {
    
// }

public class AbstractClass {
    public static void main(String[] args) {
        // Loan obj = new Loan();
    }
}
