import java.util.Scanner;

public class NumberChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello");

        int counter = 0;
        int sum = 0;

        while (true) {
            int order = counter + 1;
            System.out.println(" Enter the Number " + order + ":");

            boolean IsAnInt = scanner.hasNextLine();

            if (IsAnInt) {
                int Number = scanner.nextInt();
                counter++;
                sum += Number;

                if (counter == 10) {
                    break;
                }
            }

            else {
                System.out.println(" Invalid Value");
            }
            scanner.nextLine();

        }
        System.out.println("The Total of All the Numbers is " + sum + ".");
        System.out.println("Thank You!");
        scanner.close();
    }
}