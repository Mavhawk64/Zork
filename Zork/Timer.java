package Zork;
import java.util.Scanner;
public class Timer
{
    long elapsed = 0;
    long startTime = 0;
    long stopTime = 0;
    public void start()
    {
        startTime = System.currentTimeMillis();
    } 

    public void stop()
    {
        stopTime = System.currentTimeMillis();
    } 

    public long elapsedTime()
    {
        elapsed = System.currentTimeMillis() - startTime;
        elapsed = elapsed/1000;
        return elapsed;
    }
}
