public class PrimeNumber {
    public static void main(String[] args) {
        int num = 100000007;
        boolean isPrime = true;
        int iter = 0;
        // for(int i = 2; i < num; i++) {
        //     iter++;
        //     if(num % i == 0) {
        //         isPrime = false;
        //         break;
        //     }
        // }

        // for(int i = 2; i < num/2; i++) {
        //     iter++;
        //     if(num % i == 0) {
        //         isPrime = false;
        //         break;
        //     }
        // }

        for(int i = 2; i*i < num; i++) {
            iter++;
            if(num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println("Took " + iter + " Iterations");
        if(isPrime) {
            System.out.println("Number is prime...");
        }
        else {
            System.out.println("Number is not prime...");
        }
    }
}
