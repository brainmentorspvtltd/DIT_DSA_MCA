public class RefDemo {
    public static void main(String[] args) {
        // String name = "Amit"; // name has Amit Reference
        // String name3 = name; // name3 has same Reference
        // String name2 = "Shashi";
        // System.out.println(name==name3);
        //String a = "Amit"; // String Literal (1 Object)
        String a = "Amit".intern(); // when u write String a = "Amit"; // Internally it use intern()
        // First Check in a String Pool that string is exist or not
        // if string is not exist so create a new string object in a pool and point to it.
        // otherwise point the existing one.
        String b = "Amit"; //(0 Object)
        
        String c = new String("Amit").intern();

        System.out.println(a==b); // true (a and b point to the same string in a pool)
        System.out.println(a==c); // if we use intern so it will give true
        // false (a is in the pool and c outside the pool)



        // new always create a new memory
        // new is a keyword 

        // if we want to compare the value
        // equals is a predefine function to compare the string values
        // System.out.println(a.equals(b)); 
        // System.out.println(a.equals(c));
        
    }

}
