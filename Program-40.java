/* Program-40  
Program to create a Thread using Runnable Interface */

class program40 implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Student is studying: " + i);
        }
    }

    public static void main(String[] args) {
        program40 obj = new program40();
        Thread t = new Thread(obj);

        System.out.println("Main method started.");
        t.start();

        System.out.println("Thread created successfully.");
    }
}