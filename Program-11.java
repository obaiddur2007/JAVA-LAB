/* Program-11
Program to demonstrate Interface in Java */

interface Bank
{
	void deposit();
}

class SBI implements Bank
{
    	public void deposit()
    {
        System.out.println("Amount deposited in SBI");
    }
}

public class Interface
{
    	public static void main(String args[])
    {
        SBI s = new SBI();
        s.deposit();
    }
}