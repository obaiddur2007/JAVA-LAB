/* Program-29  
Program to demonstrate Exception Propagation in Java */

class program29 {
    static void show() {
        int num = Integer.parseInt("abc");
        System.out.println(num);
    }

    static void display() {
        show();
    }

    public static void main(String[] args) {
        try {
            display();
        } catch (Exception e) {
            System.out.println("Invalid number entered");
        }

        System.out.println("Program completed");
    }
}