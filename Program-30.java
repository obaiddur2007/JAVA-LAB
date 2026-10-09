/* Program-30  
Program to demonstrate Exception Chaining in Java */

class program30 {
    public static void main(String[] args) {
        try {
            try {
                int age = -5;

                if (age < 0) {
                    throw new IllegalArgumentException("Age cannot be negative");
                }
            } catch (IllegalArgumentException e) {
                throw new Exception("Invalid age entered", e);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Original cause: " + e.getCause().getMessage());
        }
    }
}