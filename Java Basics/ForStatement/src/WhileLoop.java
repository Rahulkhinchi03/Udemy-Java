public class WhileLoop {
    public static void main(String[] args) {

        int number = 10;
        int EndNumber = 50;
        int TotalNumber = 0;

        while (number <= EndNumber){
            number++;
            if (!IsEvenNumber(number)){
                continue;
            }
            System.out.println("Even Number = " + number);
            TotalNumber++;
            if (TotalNumber >= 10) {
                break;
            }

        }
        System.out.println("Total Even Number = " + TotalNumber);

    }
    public static boolean IsEvenNumber(int NUMBER) {
        if (NUMBER % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}