package Arrays;

public class CheckTheNumber {

    public static void main(String[] args) {

        int[] marks = {22, 44, 66, 34, 76, 88};
        int rahul = 35;
        boolean isThere = false;

        for (int element : marks) {
            if (element == rahul)
                break;
        }

        if (isThere) {
            System.out.println("Present");
        } else {
            System.out.println("Absent");
        }
    }
}


