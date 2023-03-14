class P1 {
    int x;
    P1() {
        x = 10;
        System.out.println("P1 Default Const...");
    }
}

class C1 extends P1 {
    int x;
    C1() {
        super();    // internally java has written super
        System.out.println("C1 Default Const...");
        x = 20;
    }
    C1(int x) {
        // local variable + instance variable + parent class variable
        int total = x + this.x + super.x;
        System.out.println("Total is : " + total);
    }
}

public class SuperVsThis {
    public static void main(String[] args) {
        // C1 obj = new C1();
        C1 obj = new C1(50);
    }
}
