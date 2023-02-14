public class WrapperClass {
    public static void main(String[] args) {
        // Wrapper - wraps primitive data types / encapsulate primitive
        // Boxing - convert primitive data types to object
        int x = 12;
        Integer x1;
        x1 = 6;
        // AutoBoxing
        int y = x1;     // UnBoxing
        Integer y1 = y; // Boxing

        Byte b1 = 12;
        Double dl = 24.55;

        double d = 4.5;
        int i = (int)d;     // manual type casting in Java - narrowing
        double d1 = 6;      // automatically type casting - widening

        // Types of type casting - 
        // (type conversion - compiler is handling) - widening 
            // - automatically - smaller data type to larger data type
        // (type casting - developer is handling) - narrowing 
            // - manually     - larger data type to smaller data type

    }
}