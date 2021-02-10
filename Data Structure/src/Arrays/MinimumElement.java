package Arrays;

import java.util.Scanner;

public class MinimumElement {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        findMin(readElements(4));
    }

    private static int readInteger() {


            System.out.println("Enter a Number: ");
        int array = scanner.nextInt();


        return array;
    }

    private static int[] readElements(int count) {
        int[] array = new int[count];
        for(int i = 0; i<array.length; i++) {
            System.out.println("Enter a Number: ");
            int number = scanner.nextInt();

            array[i] = number;
        }
        return array;
    }

    private static int findMin(int [] array ) {

        int minimumValue = array[0];
        for(int i = 0; i<array.length; i++) {
            if(array[i] < minimumValue) {
                minimumValue = array[i];
            }
        }
        System.out.println( "The min val is " + minimumValue);
return minimumValue;
    }


    
}
