/* Program-27  
Program to demonstrate Throws Keyword in Java */

class program27 {
    static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be 18 or above");
        }

        System.out.println("You are eligible");
    }

    public static void main(String[] args) {
        try {
            checkAge(20);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}