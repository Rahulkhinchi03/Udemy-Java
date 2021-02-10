package learning.java;

public class MethodOverloading {

    public static void main(String[] args) {
        System.out.println(CalcFeetAndInchesToCentimeters(6,0));
        CalcFeetAndInchesToCentimeters(100);

    }
        public static double CalcFeetAndInchesToCentimeters ( double feet, double inches){

            if (feet < 0 || (inches < 0 || inches >12)) {
                return -1;
            }
            double Inches = (feet * 12);
            double centimeters = Inches * 2.54;
            System.out.println(inches + " inches " + feet + " feet = " + centimeters + " centimeters ");

            return centimeters;
        }
    public static double CalcFeetAndInchesToCentimeters (double inches) {

        if (inches < 0) {
            return -1;
        }
        double Feet =  (int)inches / 12;
        double remaininginches =  (int) inches % 12;
        System.out.println(inches + " inches is equal to " + Feet +
                " feet and " + remaininginches + " inches "  );
        return CalcFeetAndInchesToCentimeters(Feet, inches);
        


    }




}
