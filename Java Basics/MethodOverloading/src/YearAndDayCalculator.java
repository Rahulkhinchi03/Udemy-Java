public class YearAndDayCalculator {
    public static void main(String[] args) {
        printYearsAndDay(561600);

    }

    public static void printYearsAndDay (long minutes ){

        if (minutes < 0 ) {
            System.out.println("INVALID VALUE");
        }

        long Year = minutes / 525600;
        long Day = minutes % 525600;
        Day = Day / 1440;
        System.out.println(minutes + " Minutes  = " + Year + " YEAR " + Day + " DAY ");

    }
}
