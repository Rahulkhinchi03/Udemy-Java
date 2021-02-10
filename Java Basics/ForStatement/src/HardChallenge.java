public class HardChallenge {
    public static void main(String[] args) {

        int count = 0;
        for ( int i = 5; i < 50; i ++) {
            if (IsPrimeNumber(i)) {
                count++;
                System.out.println(" Number " + i + " is a prime number.");
                if (count == 6 )
                break;
            }
        }

    }
    public static boolean IsPrimeNumber(int n) {

        if (n == 1){
            return false;
        }
        for ( int i = 2; i <= n/2; i++){
            if (n % i == 0){
                return false;
            }

        }
        return true;
    }
}
