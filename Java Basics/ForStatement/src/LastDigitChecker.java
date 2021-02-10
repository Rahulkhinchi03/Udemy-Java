public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit (9,99,999));

    }

    public static boolean hasSameLastDigit (int FirstNumber, int SecondNumber, int ThirdNumber) {

        if ((FirstNumber >= 10 && FirstNumber <= 1000) && (SecondNumber >= 10 && SecondNumber <= 1000) &&
                ThirdNumber >= 10 && ThirdNumber <= 1000) {

        int FirstNumberLastDigit;
        int SecondNumberLastDigit;
        int ThirdNumberLastDigit;

        FirstNumberLastDigit = FirstNumber % 10;
        SecondNumberLastDigit = SecondNumber % 10;
        ThirdNumberLastDigit = ThirdNumber % 10;


        return  ((FirstNumberLastDigit == SecondNumberLastDigit) ||
                (FirstNumberLastDigit == ThirdNumberLastDigit)
        || (SecondNumberLastDigit == ThirdNumberLastDigit));

        }
        else {
            return false;
        }
    }

    public static boolean isValid (int number) {

        if (number >= 10 && number <= 1000) {
            return true;
        }
        else {
            return false;
        }
    }
}