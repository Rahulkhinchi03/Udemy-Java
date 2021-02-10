package learning.java;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(GetDurationStarted(442,33));
        System.out.println(GetDurationStarted(442));

    }
    private static String GetDurationStarted (long minutes, long  seconds) {

        if (minutes < 0 || (seconds < 0 || seconds > 59)) {
            return "Invalid Value";
        }

        long hour = minutes / 60;
        long Remainingminutes = minutes % 60;
        return hour + " hour " + Remainingminutes + " minutes "  + seconds + " seconds ";

    }

    private static String GetDurationStarted(long seconds) {

        if (seconds < 0) {
            return "INVALID VALUE";
        }
        long minutes = seconds / 60;
        long RemainingSeconds = seconds % 60;
        return minutes + " minutes " + RemainingSeconds + " seconds ";
    }




    }

