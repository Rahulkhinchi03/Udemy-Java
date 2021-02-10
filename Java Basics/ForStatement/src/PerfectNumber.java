public class PerfectNumber {
    public static void main(String[] args) {

        System.out.println(isPerfectNumber(23));


    }

    public static boolean isPerfectNumber (int number) {
        int sum = 0;
        if (number < 1) {
            return false;

        }
        for (int i = 1; i < number; i++) {

            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number) {
            System.out.println("It is a Perfect Number");
            return true;
        }
        else {
            System.out.println("Not a Perfect Number");
            return false;
        }


    }
}

