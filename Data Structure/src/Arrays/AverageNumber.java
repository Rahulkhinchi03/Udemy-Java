package Arrays;

public class AverageNumber {
    public static void main(String[] args) {


        int[] marks = {10,10,10,10,10,10,10,10,10,10};
        double sum = 0;
        double average;

        for(int element: marks) {
            sum+=element;

        }
        System.out.println("The sum of marks is: " + sum);
        average = sum / marks.length;
        System.out.println("The average of the marks is: " + average);



    }
}
