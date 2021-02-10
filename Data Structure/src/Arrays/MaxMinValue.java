package Arrays;

public class MaxMinValue {
    public static void main(String[] args) {


        int marks [] = {7,8,9,10};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int element: marks) {
            if(element > max) {
                max = element;
            }
        }
        for(int e: marks) {
            if(e < min) {
                min = e;
            }
        }
        System.out.println("The Maximum value is: " + max);
        System.out.println("The Minimum value is: " + min);

    }
}
