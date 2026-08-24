/* Program-17
   Program to demonstrate Interface in Java */

interface Study
{
    void study();
}

class StudentDetails implements Study
{
    public void study()
    {
        System.out.println("Student is studying Java");
    }
}

public class Interface
{
    public static void main(String[] args)
    {
        Study s = new StudentDetails();

        s.study();
    }
}