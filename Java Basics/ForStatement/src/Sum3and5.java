public class Sum3and5 {

    public static void main(String[] args) {

        int count = 0;
        int sum = 0;

        for (int i = 1; i < 1000; i ++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
                sum+=i;
                System.out.println( "The number which can be divided by 3 and 5 is " + i);
            }
            if (count == 10){
                break;
            }

        }
        System.out.println("Sum of all this number is " + sum );

    }




}

