import java.util.Scanner;

public class CbseCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your Marks-");

        System.out.println("Physics: ");
        int Physics = sc.nextInt();

        System.out.println("Chemistry: ");
        int Chemistry = sc.nextInt();

        System.out.println("Maths: ");
        int Maths = sc.nextInt();

        System.out.println("English: ");
        int English = sc.nextInt();

        System.out.println("Computer Science: ");
        int ComputerScience = sc.nextInt();

        int sum = Physics + Chemistry + Maths + English + Chemistry;
        System.out.println("TOTAL: " + sum + "/500");

        float Percentage = (sum / 5);
        System.out.println("Your Result is " + Percentage + " %");




    }
}
