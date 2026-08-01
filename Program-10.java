// Program-10
// Java program for 1D Array

import java.util.Scanner;

public class Array1D {

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int arr[] = new int[5];

    System.out.println("Enter 5 elements:");

    for (int i = 0; i < 5; i++) {
        arr[i] = sc.nextInt();
    }

    System.out.println("\nElements of 1D Array are:");

    for (int i = 0; i < 5; i++) {
        System.out.println(arr[i]);
    }

    sc.close();
}

}
