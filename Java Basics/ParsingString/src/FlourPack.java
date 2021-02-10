public class FlourPack {
    public static void main(String[] args) {
        System.out.println(canPack(0,5,4));

    }
    public static boolean canPack (int bigCount, int smallCount, int goal) {

        int BigCountTotal = bigCount * 5;


        if (bigCount < 0 || smallCount < 0 || goal < 0 ) {
            return false;
        }
        else if (goal > (BigCountTotal + smallCount) ) {
            return false;
        }
        else if (goal % 5 > smallCount) {
            return false;
        }
        else {
            return true;
        }



    }
}
