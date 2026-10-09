/* Program-22  
Program to demonstrate Simple Exception Handling in Java */

class program22 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;

            System.out.println("Result = " + c);
        } catch (Exception e) {
            System.out.println("Exception handled successfully.");
        }
    }
}