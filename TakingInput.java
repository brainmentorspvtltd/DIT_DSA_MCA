import java.io.IOException;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) throws IOException {
        // System.out.println("Enter your name : ");
        // To take input from keyboard - System.in
        // read only 1 byte at a time and returns ASCII of the character
        // int name = System.in.read();
        // System.out.println("Name is : " + name);
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter ID : ");
        int id = scanner.nextInt();     // 101\n

        scanner.nextLine();     // this statement will eat up the remaining \n

        System.out.println("Enter your name : ");
        // scanner.nextLine - used to take input in String type
        // reads input until we press Enter (\n)
        String name = scanner.nextLine();
        
        // scanner.next - used to take input in String type
        // but is can read only one word
        // String name = scanner.next();

        System.out.println("Enter Age : ");
        byte age = scanner.nextByte();

        scanner.nextLine();

        System.out.println("Enter City : ");
        String city = scanner.nextLine();

        System.out.println("Welcome : " + name);
        System.out.println("ID : " + id);
        System.out.println("Age : " + age);
        System.out.println("City : " + city);
        
        scanner.close();
    }
}
