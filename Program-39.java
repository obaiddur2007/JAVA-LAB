/* Program-39  
Program to create a Thread using Thread Class */

class program39 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread is running: " + i);
        }
    }

    public static void main(String[] args) {
        program39 t = new program39();

        System.out.println("Main thread started.");
        t.start();
        System.out.println("Main thread completed.");
    }
}