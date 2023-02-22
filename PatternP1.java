public class PatternP1 {
    public static void main(String[] args) {
        // *****
        // for(int i = 0; i < 5; i++) {
        //     System.out.print("*");
        // }
        
        // *****
        // *****
        // *****
        // *****
        // *****
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("==============");

        // *
        // **
        // ***
        // ****
        // *****
        for(int i = 1; i <= 5; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("==============");

        // *****
        // ****
        // ***
        // **
        // *
        for(int i = 1; i <= 5; i++) {
            for(int j = 0; j < 6-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("==============");

        // ----*
        // ---**
        // --***
        // -****
        // *****
        for(int i = 1; i <= 5; i++) {
            for(int j = 0; j < 5-i; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("==============");

        // *****
        //  ****
        //   ***
        //    **
        //     *
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < 6-i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("==============");

    }
}
