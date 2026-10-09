/* Program-25  
Program to demonstrate Multiple Catch Block in Java */

class program25 {
    public static void main(String[] args) {
        try {
            int arr[] = {10, 20, 30};

            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is invalid");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error occurred");
        }

        System.out.println("Program completed.");
    }
}