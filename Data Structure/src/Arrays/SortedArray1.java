package Arrays;

public class SortedArray1 {
    public static void main(String[] args) {



        int marks [] = {2,4,55,34,35};
        boolean isSorted = true;

        for(int i = 0; i < marks.length-1; i++) {
            if(marks[i] > marks[i + 1] ) {
                isSorted = false;
                break;
            }
        }
        if(isSorted) {
            System.out.println("The array is Sorted");
        }
        else {
            System.out.println("The array is not Sorted");
        }







    }


}
