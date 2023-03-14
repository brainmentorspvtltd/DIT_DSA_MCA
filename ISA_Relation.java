class Account {
    int acc_no;
    String name;
    double balance;
    void withdraw() {
        System.out.println("Withdraw limit is 50K");
    }
    void deposit() {
        System.out.println("Deposit limit is 1 Lac");
    }
}

class SavingAccount extends Account {
    void roi() {
        System.out.println("ROI on Saving Account is 5%");
    }
    @Override
    void withdraw() {
        System.out.println("Withdraw Limit for SA is 1 Lac");
    }
}

class CurrentAccount extends Account {
    void odLimit() {
        System.out.println("OD Limit is 50K...");
    }
    @Override
    void deposit() {
        System.out.println("Current Account Deposit Limit is 3 Lac");
    }
}

public class ISA_Relation {

    // Polymorphic call
    void caller(Account acc) {
        acc.deposit();
        acc.withdraw();
        // Downcasting
        if(acc instanceof SavingAccount) {
            SavingAccount sa = (SavingAccount)acc;
            sa.roi();
        }
        else if(acc instanceof CurrentAccount) {
            CurrentAccount ca = (CurrentAccount)acc;
            ca.odLimit();
        }
    }

    public static void main(String[] args) {
        // SavingAccount sa = new SavingAccount();
        // sa.withdraw();  // will call Saving Account withdraw()
        // sa.deposit();   // will call Account deposit()
        // sa.roi();       // will call Saving Account ROI

        // CurrentAccount ca = new CurrentAccount();
        // ca.deposit();   // will call Current Account deposit()
        // ca.withdraw();  // will call Account withdraw()
        // ca.odLimit();   // will call CurrentAccount ODLimit


        // we are still creating object of SavingAccount class (Child Class)
        // but the type of object is Account class (Parent)
        // Upcasting
        // now we can access only those methods which are defined inside Parent 
        // class or we can access overrided methods
        // Account acc = new SavingAccount();
        // acc.withdraw();  // will call Saving Account withdraw()
        // acc.deposit();   // will call Account deposit()
        // acc.roi();       // will call Saving Account ROI

        // acc = new CurrentAccount();
        // acc.deposit();   // will call Current Account deposit()
        // acc.withdraw();  // will call Account withdraw()
        // acc.odLimit();   // will call CurrentAccount ODLimit

        ISA_Relation obj = new ISA_Relation();
        obj.caller(new SavingAccount());
        obj.caller(new CurrentAccount());
    }
}
