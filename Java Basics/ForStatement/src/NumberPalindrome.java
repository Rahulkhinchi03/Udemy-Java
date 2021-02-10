public class NumberPalindrome {
    public static void main(String[] args) {
        boolean RK7 = isPalindrome(1234321);
        System.out.println(RK7);

    }
    public static boolean isPalindrome (int number) {
        int reverse = 0;
        int LastDigit = 0;
        int value = number;  // number will change afterwards so to make a permanent value.

        while (number > 0 || number != 0) {


            LastDigit = number % 10;   // To get the Last Digit
            reverse = reverse * 10;    // 0 = 0 * 10 = 0 (Increases the Place Value of Reverse)
            reverse += LastDigit;    // reverse + Last Digit
            number /= 10;            // number / 10.

            if (value == reverse) {
                System.out.println("The Number " + value + " is a Palindrome.");
                return true;
            }
        }
                System.out.println("The Number " + value + " is NOT a Palindrome.");
                return false;



    }


}
