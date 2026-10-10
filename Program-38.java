/* Program-38  
Program to display Calendar Information using Gregorian Calendar */

import java.util.GregorianCalendar;

class program38 {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();

        System.out.println("Year: " + gc.get(GregorianCalendar.YEAR));
        System.out.println("Month: " + (gc.get(GregorianCalendar.MONTH) + 1));
        System.out.println("Day: " + gc.get(GregorianCalendar.DATE));
        System.out.println("Day of Week: " + gc.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println("Day of Year: " + gc.get(GregorianCalendar.DAY_OF_YEAR));
        System.out.println("Week of Year: " + gc.get(GregorianCalendar.WEEK_OF_YEAR));

        System.out.println("Leap Year: " + gc.isLeapYear(gc.get(GregorianCalendar.YEAR)));
    }
}