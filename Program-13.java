/*Program-13
  Program to perform simple inheritance */

class Mobile
{
    	void brand()
    {
        System.out.println("Brand: Samsung");
    }
	void model()
    {
        System.out.println("Model: Galaxy A55");
    }
}

class Smartphone extends Mobile
{
    	void feature()
    {
        System.out.println("Feature: Fingerprint Sensor");
    }
}

public class SimpleInheritance
{
    	public static void main(String args[])
    {
        Smartphone s = new Smartphone();

        s.brand();
	s.model();
        s.feature();
    }
}