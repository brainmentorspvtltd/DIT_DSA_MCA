enum Language {
    ENGLISH, HINDI
}

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Enter your choice : ");
        System.out.println("Press 1 for English : ");
        System.out.println("Press 2 for Hindi : ");
        // int choice = 1;
        Language choice = Language.ENGLISH;
        String ch = "en";
        // int lang = 1;

        switch (ch) {
            case "en":
                System.out.println("You selected English...");
        }

        switch (choice) {
            case ENGLISH:
                System.out.println("You have selected english");
                break;
            case HINDI:
                System.out.println("You have selected hindi");
                break;
            default:
                System.out.println("Please enter a valid choice");
                break;
        }
    }
}
