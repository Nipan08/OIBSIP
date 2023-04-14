package number_guessing_game;

import java.util.Scanner;

public class Guess_game {
    Scanner sc=new Scanner(System.in);
    double r;
    int rand;
    public void rand()
    {
        r= Math.random()*99;
        rand=(int)r;
    }
    public void game()
    {
        System.out.println("\nLets Begin!!!");
        int turns=8,guess;
        rand();
        while (turns>=1)
        {
            System.out.println("Turns Left - "+turns);
            System.out.println("Enter your Guess");
            guess= sc.nextInt();
            if(rand==guess)
            {
                System.out.println("\nCongrats!!! you have guessed the correct number.");
                break;
            }
            else if(guess<rand)
            {
                System.out.println("\nOOPS!! Wrong Answer");
                System.out.println("Try guessing a little bit higher.....\n\n");
            }
            else if (guess>rand)
            {
                System.out.println("\nOOPS!! Wrong Answer");
                System.out.println("Try guessing a little bit lower.....\n\n");
            }
            turns--;
        }
        if(turns==0)
        {
            System.out.println("\nOOPS!! you Lost!!!!!!!");
            System.out.println("Better Luck next time......");
        }
        System.out.println("\n\nEnter 'y' to Play again or press any other key to stop playing");
        sc.nextLine();
        char c=sc.nextLine().charAt(0);
        if(c=='y'||c=='Y')
        {
            game();
        }
    }
    public void begin()
    {
        System.out.println("Enter 'y' to start");
        char c=sc.nextLine().charAt(0);
        if(c=='y'||c=='Y')
        {
            game();
        }
        else
        {
            System.out.println("Invalid try again!!!");
            begin();
        }
    }
	

	public static void main(String[] args) {
	       Guess_game ob= new Guess_game();
	        System.out.println("********************************************************************************");
	        System.out.println("                              Guess the Number                                  ");
	        System.out.println("                     Guess the number between 1 and 100 to win                  ");
	        System.out.println("********************************************************************************");
	        System.out.println("How to Play:-");
	        System.out.println("1. Computer generates a random number");
	        System.out.println("2. Guess the number to win");
	        System.out.println("3. You will be given 8 turns");
	        ob.begin();
	        System.out.println("********************************************************************************");
	        System.out.println("\n                       Thank You for Playing                                \n");
	        System.out.println("********************************************************************************");

	}

}
