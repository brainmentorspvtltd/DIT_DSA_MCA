public class IfElse {
    public static void main(String[] args) {
        int x = 10, y = 20;
        int z = 20;
        // if(x > y) {
        //     System.out.println("X is greater...");
        // }
        // else {
        //     System.out.println("Y is greater...");
        // }

        if(x > y && x > z) {
            System.out.println("X is greatest...");
        }
        else if(y > x && y > z) {
            System.out.println("Y is greatest...");
        }
        else {
            System.out.println("Z is greatest...");
        }
    }
}
