/* Program-41  
Program to set Thread Name and Priority and Test It */

class program41 extends Thread {
    public void run() {
        System.out.println("Thread Name: " + getName());
        System.out.println("Thread Priority: " + getPriority());
    }

    public static void main(String[] args) {
        program41 t1 = new program41();
        program41 t2 = new program41();

        t1.setName("First Thread");
        t2.setName("Second Thread");

        t1.setPriority(3);
        t2.setPriority(8);

        t1.start();
        t2.start();
    }
}