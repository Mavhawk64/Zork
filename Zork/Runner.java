package Zork;
import java.util.Scanner;
public class Runner
{
    public static void main (String [] args)
    {
        System.out.println("Welcome to Clearwater Lake Hospital!");
        System.out.println("Would you like to continue to the story?");
        MaverickHorror game = new MaverickHorror();
        game.Timers();
        for(int i = 1; i < 2; i++)
        {
            Scanner horror = new Scanner(System.in);
            String juego = horror.nextLine();
            if(juego.equalsIgnoreCase("yes"))
            {
               
                game.Play();
                i++;
            }
            else if(juego.equalsIgnoreCase("no"))
            {
                System.out.println("Ok, weirdo.");
                i++;
            }
            else
            {
                System.out.println("Please type again...");
                i--;
            }
        }
    }
}
