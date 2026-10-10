/* Program-33  
Program to demonstrate Local Inner Class in Java */

class program33 {
    void calculate() {
        int a = 12;
        int b = 03;

        class Addition {
            void display() {
                System.out.println("First Number = " + a);
                System.out.println("Second Number = " + b);
                System.out.println("Sum = " + (a + b));
            }
        }

        Addition obj = new Addition();
        obj.display();
    }

    public static void main(String[] args) {
        program33 obj = new program33();
        obj.calculate();
    }
}