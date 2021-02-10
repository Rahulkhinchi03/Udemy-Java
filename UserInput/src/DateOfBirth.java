import java.util.Scanner;

public class DateOfBirth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.println(" Enter your Year of Birth: ");
        int YearOfBirth = scanner.nextInt();
        scanner.nextLine();

        System.out.println(" Enter your Name: ");
        String Name = scanner.nextLine();
        int age = 2020 - YearOfBirth;
if (age > 10 && age < 100) {
    System.out.println(" HURRRAAAAYYY");
    System.out.println(Name + ", You are " + age + " Years old.");
}
else {
    System.out.println(Name + ", You have entered an Invalid Year of Birth." );
    System.out.println("PLEASE TRY AGAIN!!");
}
        scanner.close();
    }
}
