package learning.java;

public class NODinMONTHS {

    public static void main(String[] args) {
        IsLeapYear(2020);
        GetDaysInMonth(6,2020);



    }

    public static boolean IsLeapYear (int year) {
        if (year < 0 || (year < 0 || year > 9999)) {
            System.out.println("INVALID VALUE");
            return false;
        }

        else if ((year % 4 == 0 && year !=100) || year % 400 == 0 ) {
            System.out.println("IT IS LEAP YEAR");
            return true;
        }
        else System.out.println(" NOT A LEAP YEAR ");
        return false;




    }

    public static void GetDaysInMonth ( int month, int year) {
        if (month < 0 || month > 12) {
            System.out.println("INVALID MONTH");
        }

        switch (month = 2){
            case 1:
                System.out.println("January");


            case 3:
                System.out.println("March");


            case 5:
                System.out.println("May");


            case 7:
                System.out.println("July");


            case 8:
                System.out.println("August");


            case 10:
                System.out.println("October");;

            case 12:
                System.out.println("December");
                System.out.println("31");
                break;

            case 4:
                System.out.println("April");

            case 6:
                System.out.println("June");

            case 9:
                System.out.println("September");

            case 11:
                System.out.println("November");
                System.out.println("30");
                break;

            case 2:
                System.out.println("February");
                System.out.println("29");
                break;

            default:
                System.out.println("THE END");









        }


    }
}
