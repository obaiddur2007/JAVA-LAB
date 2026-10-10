/* Program-31  
Program to demonstrate Simple Inner Class in Java */

class program31 {
    class Student {
        void show() {
            System.out.println("Student Name Rahman");
            System.out.println("Subject Java");
        }
    }

    public static void main(String[] args) {
        program31 obj = new program31();
        Student s = obj.new Student();

        s.show();
    }
}