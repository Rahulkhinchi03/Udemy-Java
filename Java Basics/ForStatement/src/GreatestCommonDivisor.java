public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println("The Greatest Common Divisor is: " + getGreatestCommonDivisor(81,153) + ".");

    }

    public static int getGreatestCommonDivisor (int first, int second) {

        int GCD = 0;

        if (first < 10 || second < 10 ) {
            return -1;
        }
        else {

            for (int i = 1; i <= first && i <= second; i++) {


                if (first % i == 0 && second % i == 0 ) {
                    GCD = i;

                }
            }
        }
return GCD;
    }

}
