public class DigitSumChallenge {
    public static void main(String[] args) {

        System.out.println("THE SUM IS " + sumDigits(333));

    }
    private static int sumDigits (int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {

        int Digit = number % 10;
        sum += Digit;
        number /= 10;
    }

        return sum;
    }

 }
