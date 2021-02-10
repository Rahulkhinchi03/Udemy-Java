public class challenge {
    public static void main(String[] args) {

        for (int i = 8; i >= 2; i--) {
            System.out.println(" The Interest Rate of 10,000 at " + i + "% is "
                    + String.format("%.2f", CalculateInterest(10000.00, i)));
        }




    }
    public static double CalculateInterest(double amount, double interest) {
        return (amount * (interest / 100.0));
    }
    }