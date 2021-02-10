package Arrays;
public class ReverseArray {
    public static void main(String[] args) {

        int [] reverse = {1,2,3,4,5,6};
        int length = reverse.length;
        int n = Math.floorDiv(length,2);
        int temp ;

        for(int i = 0; i < n; i++) {
            temp = reverse[i];
            reverse[i] = reverse[length - 1 - i];
            reverse[length - 1 - i] = temp;
        }

        for(int element: reverse) {
            System.out.print(" " + element);
        }



    }
}
