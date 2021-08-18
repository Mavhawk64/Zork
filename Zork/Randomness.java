package Zork;
import java.util.Random;

public class Randomness
{
    public void Random()
    {
        Random rand = new Random();
        int r1 = rand.nextInt(100) + 1;           
        MaverickHorror mh = new MaverickHorror();
        if(r1 > 50)
        {
            mh.A11();
        }
        else
        {
            mh.B10();
        }
    }
}
