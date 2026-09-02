// Program-9
// Java program to find student result and grade using IF condition

import java.util.Scanner;

public class StudentGrade{
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter marks (0-100): ");
    int marks = sc.nextInt();

    if (marks >= 90) {
        System.out.println("Result : PASS");
        System.out.println("Grade  : A+");
    }
    else if (marks >= 75) {
        System.out.println("Result : PASS");
        System.out.println("Grade  : A");
    }
    else if (marks >= 60) {
        System.out.println("Result : PASS");
        System.out.println("Grade  : B");
    }
    else if (marks >= 50) {
        System.out.println("Result : PASS");
        System.out.println("Grade  : C");
    }
    else if (marks >= 35) {
        System.out.println("Result : PASS");
        System.out.println("Grade  : D");
    }
    else {
        System.out.println("Result : FAIL");
        System.out.println("Grade  : F");
    }

    sc.close();
}

}
