/* Program-35  
Program to display Date in Different Formats in Java */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class program35 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        DateTimeFormatter f4 = DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy");

        System.out.println("Format 1: " + date.format(f1));
        System.out.println("Format 2: " + date.format(f2));
        System.out.println("Format 3: " + date.format(f3));
        System.out.println("Format 4: " + date.format(f4));
    }
}