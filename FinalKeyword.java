// final class - cannot be inherited
// so that no one can access the class or modify any methods

// final class A {
class A {
    // final method - methods cannot be overrided
    final void login() {
        System.out.println("Login Function");
    }
}

class B extends A {
    // @Override
    // void login() {
    //     System.out.println("....");
    // }
}

public class FinalKeyword {
    public static void main(String[] args) {
        // final variable - no one can change the value of variable
        final double PI = 3.14;
    }
}
