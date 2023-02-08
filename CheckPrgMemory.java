import java.util.ArrayList;

public class CheckPrgMemory {
    public static void main(String[] args) throws Exception{
        //String arr[] = new String[1000000]; // Fixed Size Array
        // Dynamic Array
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Program Start...");
        while(true){
            String a= new String("Hello");
            list.add(a);
            // Sleep
            Thread.sleep(50);

        }
    }
}
