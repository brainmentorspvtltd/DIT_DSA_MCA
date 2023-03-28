public class TypePromotion {
    void show(byte x) {
        System.out.println("Byte X");
    }
    // void show(int x) {
    //     System.out.println("Int X");
    // }
    // void show(float x) {
    //     System.out.println("Float X");
    // }
    void show(short x) {
        System.out.println("Short X");
    }
    // void show(long x) {
    //     System.out.println("Long X");
    // }
    // void show(Integer x) {
    //     System.out.println("Integer Wrapper X");
    // }
    // void show(Float x) {
    //     System.out.println("Float Wrapper X");
    // }
    void show(int ...x) {
        System.out.println("Var Args... X");
    }
    public static void main(String[] args) {
        TypePromotion obj = new TypePromotion();
        // obj.show(23);   // will call int by default
        // obj.show(23);
        obj.show((byte)10);
        obj.show((short)20);
        obj.show(4,5,7,8,3);
    }
}
