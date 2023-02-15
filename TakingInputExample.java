import java.util.Scanner;

public class TakingInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = scanner.nextLine();
        // fetch first letter
        // char firstChar = name.charAt(0);
        // when we use charAt then we get char data type, so we need to
        // type cast the char into String using String.valueOf()
        // String firstLetter = String.valueOf(firstChar).toUpperCase();
        // String fullName = firstLetter + name.substring(1).toLowerCase();

        String fullName = "";
        String words[] = name.split(" ");
        for(String s : words) {
            if(s.equals("")) {
                continue;
            }
            char firstChar = s.charAt(0);
            String firstLetter = String.valueOf(firstChar).toUpperCase();
            fullName += firstLetter + s.substring(1).toLowerCase() + " ";
        }

        System.out.println("Welcome : " + fullName);
        scanner.close();
    }
}
