public class EqualityPrinter {

    public static void main(String[] args) {
        PrintEqual(1,3,5);

    }

    public static void PrintEqual (int x, int y, int z) {
        if (x < 0 || y < 0 || z < 0 ) {
            System.out.println("INVALID VALUE");
        }

        else if ( x == y && y == z && z == x) {
            System.out.println("ALL NUMBERS ARE EQUAL");
        }
        else if (x != y && y != z && z != x) {
            System.out.println("ALL NUMBERS ARE DIFFERENT");
        }
        else
            System.out.println("ALL ARE NEITHER EQUAL NOR DIFFERENT");
    }
}

