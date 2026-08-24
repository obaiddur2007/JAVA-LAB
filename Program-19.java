/* Program-19
   Program to demonstrate Method Overriding in Java */

class Vehicle
{
    void move()
    {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle
{
    @Override
    void move()
    {
        System.out.println("Car is moving on the road");
    }
}

public class MethodOverriding
{
    public static void main(String[] args)
    {
        /* Create Car object using Vehicle reference */
        Vehicle v = new Car();

        /* Call overridden method */
        v.move();
    }
}