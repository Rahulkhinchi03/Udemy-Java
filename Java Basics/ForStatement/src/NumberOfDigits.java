import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int NumberOfDigits = (int) Math.log10(n) + 1;
        System.out.println(NumberOfDigits);

    }
}
