// Program-3
// Java program to get personal information from user and display it on screen

import java.util.Scanner;

public class PersonalInfo {

public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

   	System.out.print("Enter your age: ");
        int age = sc.nextInt();
  	sc.nextLine();

  	System.out.print("Enter your city: ");
        String city = sc.nextLine();

        System.out.print("Enter your mobile number: ");
        String mobile = sc.nextLine();

        System.out.println("\n--- Personal Information ---");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("City   : " + city);
        System.out.println("Mobile : " + mobile);

        sc.close();
}

}
