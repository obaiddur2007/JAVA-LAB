// Program-8
// Java program to find ODD or EVEN number using command line argument

public class OddEven {

public static void main(String[] args) {

	int num = Integer.parseInt(args[0]);

        if (num % 2 == 0) {
        System.out.println(num + " is EVEN number.");
    } else {
        System.out.println(num + " is ODD number.");
    }
}

}
