/* Program-28  
Program to demonstrate Custom Exception in Java */

class InvalidMarksException extends Exception {
    InvalidMarksException(String message) {
        super(message);
    }
}

class program28 {
    public static void main(String[] args) {
        int marks = 120;

        try {
            if (marks > 100 || marks < 0) {
                throw new InvalidMarksException("Invalid marks entered");
            }

            System.out.println("Marks = " + marks);
        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }
    }
}