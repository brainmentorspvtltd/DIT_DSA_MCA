public strictfp class  VarConstant { // PascalCase
    //public static strictfp void main(String[] args) {
        public static  void main(String[] args) {
        int firstNumber  = 10;  // camelCase
        int secondNumber = 20;
        int result = firstNumber + secondNumber; // int + int (Addition)
        System.out.println("Sum is "+result); // String + int (Concate)
        double x = 10.20;
        float y = 100.20f; // Float Literal
        float z = 100.20F;
        float t = (float)100.20; // Typecast
        byte e = 100; // -128 to 127
        e = (byte)130; 
        System.out.println(e);
        long t2 = 100000L; // 100000l; long literal
        char w = 'A';
        char w2 = 'न';
        System.out.println(w2);
        String message = "नमस्ते, आप कैसे हैं"; // Collection of chars
        System.out.println(message);
        boolean att = true; 

        String message2 = "            ";
        System.out.println(message2.length());
        char p = 65;
        System.out.println(p);
        int tt = 'A'; // Ascii Code 
        System.out.println(tt);



    }
}
