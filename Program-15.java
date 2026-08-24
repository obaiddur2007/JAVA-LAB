/* Program-15
   Program to demonstrate Hierarchical Inheritance in Java */

class Employee
{
        void work()
    {
        System.out.println("Employee is working.");
    }
}

class Manager extends Employee
{
    
    	void manage()
    {
        System.out.println("Manager manages the team.");
    }
}

class Developer extends Employee
{
    
    	void develop()
    {
        System.out.println("Developer writes code.");
    }
}

public class Company
{
    	public static void main(String[] args)
    {
        /* Create object of Manager class */
        Manager m = new Manager();

        m.work();
        m.manage();

        /* Create object of Developer class */
        Developer d = new Developer();

        d.work();
        d.develop();
    }
}