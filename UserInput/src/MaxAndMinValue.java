import java.util.Scanner;

public class MaxAndMinValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;


        while (true) {
            System.out.println("Please Enter Number: ");
            boolean IsAnInt = scanner.hasNextInt();

            if (IsAnInt) {
                int number = scanner.nextInt();


                    if (number > max) {
                        max = number;
                    }
                        if (number < min) {
                            min = number;
                        }


            }
            else{
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Minimun = " + min + " and " + "Maximum = " + max);
        scanner.close();

    }
}
