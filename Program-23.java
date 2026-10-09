/* Program-23  
Program to demonstrate Arithmetic Exception in Java */

class program23 {
    public static void main(String[] args) {
        int marks = 100;
        int students = 0;

        try {
            int average = marks / students;
            System.out.println("Average Marks = " + average);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed");
        }

        System.out.println("Program completed");
    }
}