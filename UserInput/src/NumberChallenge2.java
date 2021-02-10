import java.util.Scanner;

public class NumberChallenge2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Hello");

        int sum = 0;


        for(int i = 1; i <= 10;  i++) {

            System.out.println(" Enter Number " + i + ": ");

            boolean IsAnInt = sc.hasNextLine();
            if (IsAnInt) {
                int Number = sc.nextInt();
                sum += Number;

            }
            else{
                System.out.println("Invalid Value");
            }



        }
        System.out.println(" The Total Sum of all the Number is: " + sum);

    }

}
