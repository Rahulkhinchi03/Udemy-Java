public class SumOdd {
    public static boolean isOdd(int number) {
        if (number > 0 && number % 2 != 0) {
            return true;
        }
        else {
            return false;
            }
        }

    public static int  sumOdd(int start, int end) {
        int sum = 0;
        if ((start > 0 && end > 0) && start <= end) {

            for (int i = start; i <= end; i++ ) {
                if(isOdd(i)) {
                    System.out.println("Number " +i +".");
                    sum += i;
                }
            }
            System.out.println("The Sum Is " + sum + ".");
            return sum;
        }
        return -1;
    }
 }

