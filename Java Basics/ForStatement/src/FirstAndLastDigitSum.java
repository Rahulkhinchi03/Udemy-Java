public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        int SUM = sumFirstAndLastDigit(459);
        System.out.println("Sum: " + SUM + ".");
    }

    public static int sumFirstAndLastDigit(int number) {

        int LastDigit = 0;
        int FirstDigit = 0;

        if (number < 10) {
            return -1;
        }
        LastDigit = number % 10; // To get Last Digit.


        while (number >= 10) {

            number /= 10; // To get First Digit.

}
        FirstDigit = number;
        return LastDigit + FirstDigit;
    }
}
