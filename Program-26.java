/* Program-26  
Program to demonstrate Throw Keyword in Java */

class program26 {
    public static void main(String[] args) {
        int age = 15;

        try {
            if (age < 18) {
                throw new ArithmeticException("Not eligible to vote");
            }

            System.out.println("Eligible to vote");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}