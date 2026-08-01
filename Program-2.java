// Program-2
// Java program to get a name from user and display it on screen

import java.util.Scanner;

public class NameDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Hello, " + name);

        sc.close();
    }
}