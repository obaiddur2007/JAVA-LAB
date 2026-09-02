// Program-6
// Java program to print user name 10 times using loop

import java.util.Scanner;

public class NameTenTimes {

public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("\nName printed 10 times:\n");

        for (int i = 1; i <= 10; i++) {
        System.out.println(i + ". " + name);
    }

    sc.close();
}

}
