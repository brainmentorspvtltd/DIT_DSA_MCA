public class LeapYear {
    public static void main(String[] args) {
        int year = 2000;
        boolean isLeapYear = false;
        if(year % 4 == 0) {
            if(year % 100 == 0) {
                if(year % 400 == 0) {
                    isLeapYear = true;
                }
                else {
                    isLeapYear = false;
                }
            }
            else {
                isLeapYear = true;
            }
        }
        else {
            isLeapYear = false;
        }
        
        if(isLeapYear) {
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not a leap year...");
        }
    }
}
