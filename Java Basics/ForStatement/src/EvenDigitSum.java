public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println("SUM: " + getEvenDigitSum(2345678));
    }

    public static int getEvenDigitSum (int number) {
        if (number < 0 ) {
            return  -1;
        }

 // variables

        int Sum = 0;
        int LastDigit = 0;

 // Calculations

        while(number > 0) {
            LastDigit = number % 10;

// Check if the Number is Even

            if (number % 2 == 0) {
                Sum+= LastDigit;
                number/= 10;
            }

 // if number is odd

            else{
                number /= 10;
                continue;
            }
        }

// Output
        return Sum;
    }

}
