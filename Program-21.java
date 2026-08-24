/* Program-21
   Program to demonstrate Encapsulation in Java */

class BankAccount
{
    private int balance;

    void setBalance(int amount)
    {
        balance = amount;
    }

    int getBalance()
    {
        return balance;
    }
}

public class Encapsulation
{
    public static void main(String[] args)
    {
        BankAccount b = new BankAccount();

        b.setBalance(5000);

        System.out.println("Account Balance: " + b.getBalance());
    }
}