// This is called Single line comment
/*
 * This is Multi line comment
 * Java is OOPS , so every program in java start with class.
 */
// class <ClassName>
// what is class, class is a keyword (Reserve word), we declare a class
// class name can be same or different if class is not public.
// if class is public so it names must be match with a file.
// class name should be in PascalCase e.g PrintWriter e.g AmitSrivastava
// to compile java program e.g javac <FileName>.java
// after compile we get a Byte Code (.class file), A Byte code file name is same as class name
// to run java code e.g java <ByteCodeFileName/ClassName>
/*
 * java command trigger JRE, JRE Call JVM --> JVM Looking for main to execute
 */
class FirstClass{
    // JVM Looking for main
    // main - it is like a main gate ( main is a first function which start the code execution)
    // void - it is a keyword , and it means main return nothing.
    // static - static things will be loaded when class is loaded.
    // when u run a program first it load in memory, 
    //during the load time (The class load time) , static things will be loaded
    // public is also a keyword , and it means public things access outside the folder/ package
    // String args[] - it a command line argument
    // String - It is a predefine class in java.
    // String - collection of chars
    // args - it is just a variable name and it can be anything.
    // [] - Box Syntax (Array ) - Multiple Values we can store array
    // ... - Var Arguments (Java 5)
    // print is use to print on console.
    // print will print in a same line.
    // print is a method which is coming from the PrintStream class.
    // PrintStream class - we have an out object of PrintStream
    // System class is use to create the out object
    // and out object is define as static that's why we call it by className e.g System.out
    //public static void main(String args[]){
        public static void main(String ...arguments){
            //System.out.print("Hello Java"); // print on same line
            System.out.println("Hello Java"); // Hello Java\n
            // println - print in a new line
            // we call user define main from the standard main
            char [] ch = {'A','m','i','t'};
            main(ch);
        }
        // It is like a User Define Main (Java --> JRE ---> JVM )
        public static void main(char [] args){
            System.out.println("Hello Char Main....");
        }
    
}