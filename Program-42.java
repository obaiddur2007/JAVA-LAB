/* Program-42  
Program to create Two Synchronized Threads in Java */

class Table {
    synchronized void display(int num) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}

class program42 extends Thread {
    Table t;
    int num;

    program42(Table t, int num) {
        this.t = t;
        this.num = num;
    }

    public void run() {
        t.display(num);
    }

    public static void main(String[] args) {
        Table obj = new Table();

        program42 t1 = new program42(obj, 2);
        program42 t2 = new program42(obj, 5);

        t1.start();
        t2.start();
    }
}