/* Program-24  
Program to demonstrate Finally Block in Exception Handling in Java */

class program24 {
    public static void main(String[] args) {
        try {
            int num = 20;
            int result = num / 2;

            System.out.println("Result = " + result);
        } catch (Exception e) {
            System.out.println("Exception occurred");
        } finally {
            System.out.println("Finally block is executed");
        }

        System.out.println("Program completed");
    }
}