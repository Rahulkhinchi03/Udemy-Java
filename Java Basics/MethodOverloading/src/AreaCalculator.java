public class AreaCalculator {
    public static void main(String[] args) {

        System.out.println(Area(5));
        System.out.println(Area(5,4));

    }

    public static double Area (double Radius) {

        if (Radius < 0 ) {
            return -1;
        }

        double AREA = Math.PI * (Radius * Radius);
        return AREA;

    }

    public static double Area (double length, double breadth) {


        if (length < 0 || (breadth < 0)) {
            return -1;
        }
        double AREAOFTRIANLGE =  ( length * breadth );
        return AREAOFTRIANLGE;
    }

}
