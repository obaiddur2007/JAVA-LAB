/* Program-43  
Program to join Two Threads which Perform Loop Operations */

class program43 extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " - Count: " + i);
        }
    }

    public static void main(String[] args) {
        program43 t1 = new program43();
        program43 t2 = new program43();

        t1.setName("First Thread");
        t2.setName("Second Thread");

        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        t2.start();

        try {
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        System.out.println("All tasks completed.");
    }
}