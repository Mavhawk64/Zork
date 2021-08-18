package Zork;
import java.util.Scanner;

public class MaverickHorror
{
    private Timer GameStopwatch = new Timer();
    public void Timers()
    {
        GameStopwatch.start();
    }

    public void Play()
    {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("You wake up in a hospital.");
        System.out.println("You see the nurse in the corner, staring at you as you wake up.");
        System.out.println("Nurse: 'Hello, how are you?'");
        System.out.println("You: 'I'm ok, I guess... what happened?'");
        System.out.println("Nurse: 'You were in a car crash. We need some information, what is your name?'");
        String name = scan1.nextLine();
        System.out.println("Nurse: 'Alright, " + name + " thank you.'");
        System.out.println("Nurse: 'I'll be right back with you as soon as we put your information in.'");
        System.out.println("Press Enter to continue.");
        String enter = scan1.nextLine();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("After waiting for about an hour, you finally decide to get out of bed.");
        System.out.println("You peer outside the door and see blood stains everywhere, on the floor, on the walls.");
        System.out.println("You look down the half-lit hallway and see someone.");
        System.out.println("Do you go and check who it is or go to your bed?");
        System.out.println("");
        System.out.println("A. You look to see who it is");
        System.out.println("B. You go to bed");
        String ans1 = scan1.nextLine();
        if(ans1.equalsIgnoreCase("a"))
        {
            A1();
        }
        else
        {
            B1();
        }
    }

    public void A1()
    {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("You go down the hall to see a nurse, your nurse sitting there, with blood all over her.");
        System.out.println("You hear someone scream, it sounds like someone near the front desk.");
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Do you check it out, stay put or walk the other way?");
        System.out.println("");
        System.out.println("A. Check out the scream.");
        System.out.println("B. Stay put");
        System.out.println("C. Walk the other way");
        String ans2 = scan2.nextLine();
        if(ans2.equalsIgnoreCase("a"))
        {
            A2();
        }
        else if(ans2.equalsIgnoreCase("b"))
        {
            B2();
        }
        else
        {
            C2();
        }
    }

    public void B1()
    {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("You go to bed.");
        System.out.println("You hear a scream near the front desk");
        System.out.println("Do you check it out or walk the other way?");
        System.out.println("");
        System.out.println("A. Check out the scream");
        System.out.println("B. Walk a different way");
        Scanner scan3 = new Scanner(System.in);
        String ans3 = scan3.nextLine();
        if(ans3.equalsIgnoreCase("a"))
        {
            A2();
        }
        else
        {
            C2();
        }
    }

    public void A2()
    {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("You walk down the hallway to see a sick girl in a white gown, being attacked by someone.");
        System.out.println("Do you help the little girl? Or Walk away?");
        System.out.println("");
        System.out.println("A. Help her");
        System.out.println("B. Walk away");
        Scanner scan4 = new Scanner(System.in);
        String ans4 = scan4.nextLine();
        if(ans4.equalsIgnoreCase("a"))
        {
            A3();
        }
        else
        {
            C2();
        }
    }

    public void B2()
    {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("You stay put at the bloody nurse, and you feel a chill down your back...");
        System.out.println("You turn around and see a big knife coming at you.");
        for(int i = 0; i < 20; i++)
        {
            System.out.println("YOU ARE DEAD");
        }
        //GameStopwatch.stop();
        System.out.println("You lived for " + GameStopwatch.elapsedTime() + " seconds.");
    }

    public void C2()
    {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("You find yourself walking a different way.");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("After walking for about 10 minutes, you find a stairwell");
        System.out.println("It is too dark to see what is on the stairwell.");
        System.out.println("You think that it might lead to the roof.");
        Scanner scan5 = new Scanner(System.in);
        System.out.println("");
        System.out.println("A. You take the stairwell in hopes of getting out of here");
        System.out.println("B. You turn around and look for another exit");
        String ans5 = scan5.nextLine();
        if(ans5.equalsIgnoreCase("a"))
        {
            A5();
        }
        else
        {
            B5();
        }
    }

    public void A3()
    {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("You help the little girl, and hit the man with a telephone, that you grabbed from the front desk.");
        System.out.println("The man runs off, wounded from the hard hit from the telephone.");
        System.out.println("You: 'Are you ok? What is your name?'");
        System.out.println("Girl: 'My name is Madeline. Yes, I'm ok. What is your name?'");
        Scanner scan6 = new Scanner(System.in);
        String name1 = scan6.nextLine();
        System.out.println("Madeline: 'Do you know how to get out of here?'");
        System.out.println("");
        System.out.println("A. You: 'No, do you know?'");
        System.out.println("B. You: 'No, but we should go after that man that attacked you.'");
        String ans6 = scan6.nextLine();
        if(ans6.equalsIgnoreCase("a"))
        {
            A6();
        }
        else
        {
            B6();
        }
    }

    public void A5()
    {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("You go upstairs, and find a door.");
        System.out.println("It's got a chain and lock on it... if only you could find some sharp object...");
        Scanner scan7 = new Scanner(System.in);
        System.out.println("A. You look for something sharp");
        System.out.println("B. You walk back downstairs, looking for another way out.");
        String ans7 = scan7.nextLine();
        if(ans7.equalsIgnoreCase("a"))
        {
            A7();
        }
        else
        {
            B5();
        }
    }

    public void B5()
    {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("You look around for a while, not knowing where to go.");
        System.out.println("You are starting to feel sleepy, so you go to find a bed.");
        Scanner scan8 = new Scanner(System.in);
        System.out.println("Press Enter To continue...");
        String enter = scan8.nextLine();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("You finally find a room without someone in there, do you go in to the dark room, or keep looking?");
        System.out.println("A. Go in there to sleep");
        System.out.println("B. Keep looking for an exit");
        String ans8 = scan8.nextLine();
        if(ans8.equalsIgnoreCase("a"))
        {
            A8();
        }
        else
        {
            B8();
        }
    }

    public void A6()
    {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("You: 'No, do you know?'");
        System.out.println("Madeline: 'No, that is why I asked you... maybe we should go down this hallway, it's lit up.'");
        Scanner scan9 = new Scanner(System.in);
        System.out.println("");
        System.out.println("A. Go down the hallway");
        System.out.println("B. Suggest something else.");
        String ans9 = scan9.nextLine();
        if(ans9.equalsIgnoreCase("a"))
        {
            A9();
        }
        else
        {
            B9();
        }
    }

    public void B6()
    {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("You go down the hallway to see a man staring at you with a smile.");
        System.out.println("He starts running.");
        System.out.println("A knife comes at you.");

        for(int i = 0; i < 20; i++)
        {
            System.out.println("YOU ARE DEAD");
        }
        //GameStopwatch.stop();
        System.out.println("You lived for " + GameStopwatch.elapsedTime() + " seconds.");
    }

    public void A7()
    {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("You look for something sharp...");
        System.out.println("You find something sharp alright.");
        System.out.println("A sharp knife jabs you in the gut.");
        for(int i = 0; i < 20; i++)
        {
            System.out.println("YOU ARE DEAD");
        }
        //GameStopwatch.stop();
        System.out.println("You lived for " + GameStopwatch.elapsedTime() + " seconds.");
    }

    public void A8()
    {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("You go in there to find a big man sitting in there, he runs at you.");
        System.out.println("A knife comes at you.");
        for(int i = 0; i < 20; i++)
        {
            System.out.println("YOU ARE DEAD");
        }
        //GameStopwatch.stop();
        System.out.println("You lived for " + GameStopwatch.elapsedTime() + " seconds.");
    }

    public void B8()
    {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("You go look for an exit, and you come upon a door, the sign above it says, 'EXIT'");
        Scanner scan10 = new Scanner(System.in);
        System.out.println("");
        System.out.println("A. Open The Door");
        System.out.println("B. Turn Around");
        String ans10 = scan10.nextLine();
        if(ans10.equalsIgnoreCase("a"))
        {
            A10();
        }
        else
        {
            B10();
        }
    }

    public void A9()
    {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("You go down the hallway and find a door, you open it...");
        System.out.println("You won the game!");
        System.out.println("You escaped Clearwater Lake Hospital!");
        //GameStopwatch.stop();
        System.out.println("You escaped in " + GameStopwatch.elapsedTime() + " seconds.");
    }
    
    public void B9()//Random Generator?
    {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("You suggest something else, and you walk around a lot more.");
        System.out.println("Both you, and Madeline are getting tired.");
        Scanner scan12 = new Scanner(System.in);
        System.out.println("A. Go down the first hallway Madeline suggested");
        System.out.println("B. Go to sleep in a room");
        String ans12 = scan12.nextLine();
        if(ans12.equalsIgnoreCase("a"))
        {
            A9();
        }
        else
        {
            Randomness r2 = new Randomness();
            r2.Random();
        }
    }

    public void A10()
    {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        Scanner scan11 = new Scanner(System.in);
        System.out.println("Press Enter to see what happens...");
        String enter11 = scan11.nextLine();
        System.out.println("You Won The Game!");
        System.out.println("You escaped Clearwater Lake Hospital.");
        //GameStopwatch.stop();
        System.out.println("You escaped in " + GameStopwatch.elapsedTime() + " seconds.");
    }

    public void B10()
    {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("You turn around to go to bed, and...");
        System.out.println("A knife comes at you.");
        for(int i = 0; i < 20; i++)
        {
            System.out.println("YOU ARE DEAD");
        }
        //GameStopwatch.stop();
        System.out.println("You lived for " + GameStopwatch.elapsedTime() + " seconds.");
    }
    
    public void A11()
    {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("You go to the room and lock the door before you sleep.");
        System.out.println("Press Enter to continue to tomorrow.");
        Scanner sc = new Scanner(System.in);
        String entEr = sc.nextLine();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("You wake up safe and sound, and see light through the window.");
        System.out.println("You can tell that you are 3 stories up, you need to find a way out now.");
        System.out.println("Strange Man: 'Come out, come out, wherever you are!'");
        System.out.println("What do you do?");
        System.out.println("");
        System.out.println("A. Run out after he is gone.");
        System.out.println("B. Make a rope and attempt to escape through the window.");
        String Ans = sc.nextLine();
        if(Ans.equalsIgnoreCase("a"))
        {
            A12();
        }
        else
        {
            B12();
        }
    }
    
    public void A12()
    {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("You run out of the room and make it downstairs.");
        System.out.println("You make it outside!!!");
        //GameStopwatch.stop();
        System.out.println("You lived for " + GameStopwatch.elapsedTime() + " seconds.");
    }
    
    public void B12()
    {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("You fall and die...");
        for(int i = 0; i < 20; i++)
        {
            System.out.println("YOU ARE DEAD");
        }
        //GameStopwatch.stop();
        System.out.println("You lived for " + GameStopwatch.elapsedTime() + " seconds.");
    }
}
