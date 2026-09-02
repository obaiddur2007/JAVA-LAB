// Program-5
// Java program to get different values from user at runtime using Scanner

import java.util.Scanner;

public class RuntimeValues {

public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	System.out.print("Enter your name: ");
	String name = sc.nextLine();

	System.out.print("Enter your age: ");
	int age = sc.nextInt();
	System.out.print("Enter your salary: ");
	double salary = sc.nextDouble();

	System.out.println("\n--- User Details ---");
	System.out.println("Name   : " + name);
	System.out.println("Age : " + age);
	System.out.println("Salary : " + salary);

	sc.close();
}

}
