/* Program-14

   Program to demonstrate Multilevel Inheritance in Java */

class Bike
{
	/* Method of parent class */
    	void start()
    {
        System.out.println("Bike starts with a key");
    }
}

class SportsBike extends Bike
{
    	/* Method of child class */
    	void speed()
    {
        System.out.println("Sports Bike has high speed");
    }
}

class RacingBike extends SportsBike
{
    	/* Method of grandchild class */
    	void race()
    {
        System.out.println("Racing Bike is used for racing");
    }
}

public class Multilevel
{
    	public static void main(String[] args)
    {
        /* Create object of RacingBike class */
        RacingBike b = new RacingBike();

        /* Calling methods of all three classes */
        b.start();
        b.speed();
        b.race();
    }
}