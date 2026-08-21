/* Program-12
   Program to extend one interface into another interface */

interface Person
{
	void name();
}

interface Student extends Person
{
    	void study();
}

class StudentDetails implements Student
{
    	public void name()
    {
        System.out.println("Name: Obaiddur Rahman Ajaji");
    }

    	public void study()
    {
        System.out.println("Obaiddur Rahman Ajaji is Studying");
    }
}

public class InterfaceExtend
{
    	public static void main(String args[])
    {
        StudentDetails e = new StudentDetails();

        e.name();
        e.study();
    }
}