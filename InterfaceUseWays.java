import java.util.ArrayList;

// SAM - Single Abstract Method - Functional Interface
// interface Calc {
//     int add(int x, int y);
//     int sub(int x, int y);
// }

@FunctionalInterface
interface Calc {
    int add(int x, int y);
}

// Class Way
// class MyCalc implements Calc {
//     @Override
//     public int add(int x, int y) {
//         return x + y;
//     }
// }

public class InterfaceUseWays {
    public static void main(String[] args) {
        // Anonymous Class
        // Calc obj = new Calc() {

        //     @Override
        //     public int add(int x, int y) {
        //         return x + y;
        //     }

        //     @Override
        //     public int sub(int x, int y) {
        //         return x - y;
        //     }                
        // };
        // System.out.println(obj.add(12, 20));
        // System.out.println(obj.sub(10, 30));

        // Lambda Expression
        // (a,b) - arguments
        // a + b - return statement
        // Generally we can use Lambda Expression with Functional Interface
        // Calc c = (a,b) -> a + b;
        // System.out.println(c.add(12, 20));

        Calc c = (a,b) -> {
            System.out.println("Inside Add...");
            return a + b;
        };
        System.out.println(c.add(12, 10));

        ArrayList<String> list = new ArrayList<>();
        list.add("Ram");
        list.add("Shyam");
        list.add("Gopal");

        list.forEach(name -> {
            System.out.println(name);
        });

    }
}
