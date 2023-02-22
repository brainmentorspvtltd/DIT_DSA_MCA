public class PrimeNumberP2 {
    public static void main(String[] args) {
        // int num = 997;
        int num = 100000007;
        boolean isPrime = true;
        if(num % 2 == 0 || num % 3 == 0) {
            isPrime = false;
        }
        int iter = 0;
        for(int i = 5; i*i <= num; i+=6) {
            iter++;
            if(num % i == 0 || num % (i+2) == 0) {
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
