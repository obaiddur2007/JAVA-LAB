/* Program-18
   Program to demonstrate Multiple Inheritance using Interface in Java */

interface Music
{
    void playSong();
}

interface GPS
{
    void showLocation();
}

class SmartWatch implements Music, GPS
{
    public void playSong()
    {
        System.out.println("SmartWatch plays music");
    }

    public void showLocation()
    {
        System.out.println("SmartWatch shows current location");
    }
}

public class Watch
{
    public static void main(String[] args)
    {
        SmartWatch w = new SmartWatch();

        w.playSong();
        w.showLocation();
    }
}