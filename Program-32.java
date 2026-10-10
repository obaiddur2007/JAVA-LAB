/* Program-32  
Program to demonstrate Static Inner Class in Java */

class program32 {
    static int number = 50;

    static class Inner {
        void display() {
            System.out.println("Number = " + number);
        }
    }

    public static void main(String[] args) {
        program32.Inner obj = new program32.Inner();
        obj.display();
    }
}