public class LargestPrime {
    public static void main(String[] args) {

        System.out.println(getLargestPrime(217));

    }

    public static int getLargestPrime (int number) {


        if (number <= 1 ) {
            System.out.println("iNVALID VALUE");
            return -1;
        }
        else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    number/= i;


                }

            }


        }
        return number;

    }


}
