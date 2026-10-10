/* Program-34  
Program to demonstrate Nested Interface in Java */

class program34 {
    interface Payment {
        void pay();
    }

    class OnlinePayment implements Payment {
        public void pay() {
            System.out.println("Payment completed successfully");
        }
    }

    public static void main(String[] args) {
        program34 obj = new program34();
        program34.OnlinePayment p = obj.new OnlinePayment();

        p.pay();
    }
}