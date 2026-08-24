/* Program-20
   Program to demonstrate Overriding of Abstract Class in Java */

abstract class Person
{
    abstract void work();
}

class Teacher extends Person
{
    @Override
    void work()
    {
        System.out.println("Teacher teaches students");
    }
}

public class SchoolApp
{
    public static void main(String[] args)
    {
        Person p = new Teacher();

        p.work();
    }
}