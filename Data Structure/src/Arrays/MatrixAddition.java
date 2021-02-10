package Arrays;


public class MatrixAddition {
    public static void main(String[] args) {

        int [][] Matrix1 = { {6, 2, 3}, {4, 5, 6} };
        int [][] Matrix2=  { {4, 5, 6}, {1, 2, 3} };
        int [][] result =  { {0, 0, 0}, {0, 0, 0} };

        for(int i=0; i < Matrix1.length; i++) {
            for(int j=0; j< Matrix1[i].length; j++) {
                result[i][j] = Matrix1[i][j] + Matrix2[i][j];
                System.out.print(" " + result[i][j] + " ");

            }
            System.out.println(" ");
        }
    }
}
