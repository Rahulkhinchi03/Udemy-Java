public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(19,99));
    }


    public static boolean hasSharedDigit(int FirstNumber, int SecondNumber) {

        if  ( (FirstNumber > 10 && FirstNumber <= 99) && (SecondNumber > 10 && SecondNumber <= 99)) {


            int FirstNumberLastDigit = FirstNumber % 10;
            int SecondNumberLastDigit = SecondNumber % 10;
            FirstNumber /= 10;
            SecondNumber /= 10;

            int FirstNumberFirstDigit = FirstNumber;
            int SecondNumberFirstDigit = SecondNumber;


            return ((FirstNumberFirstDigit == SecondNumberFirstDigit ) ||
                    (SecondNumberLastDigit == FirstNumberLastDigit )
                    || (FirstNumberLastDigit == SecondNumberFirstDigit )
            || (SecondNumberLastDigit == FirstNumberFirstDigit));

        }

        else {
            return false;
        }

    }
}