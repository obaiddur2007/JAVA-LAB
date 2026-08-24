/* Program-16
   Program to demonstrate Abstract Class in Java */

abstract class Shape
{
    abstract void draw();

    void display()
    {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape
{
    @Override
    void draw()
    {
        System.out.println("Circle is drawn.");
    }
}

public class AbstractDemo
{
    public static void main(String[] args)
    {
        Shape s = new Circle();

        s.draw();
        s.display();
    }
}