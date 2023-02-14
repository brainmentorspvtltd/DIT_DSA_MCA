public class CLI {
    public static void main(String[] args) {
        // String name = args[0];
        // System.out.println("Welcome : "+ name);

        // int fnum = (int)args[0]; // not allowed here
        
        int fnum = Integer.parseInt(args[0]);
        int snum = Integer.parseInt(args[1]);
        int result = fnum + snum;
        System.out.println("Sum is : " + result);
    }
}
