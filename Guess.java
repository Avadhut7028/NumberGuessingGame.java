import java.util.Random;
import java.util.Scanner;
import java.io.*;
  
public class Guess {
    public static void main(String[] args)
    {
        int answer, guess;
	char ch;
  
        final int MAX = 100;

        Scanner sc = new Scanner(System.in);
  
        Random rand = new Random();
  
        boolean correct = false;

        answer = rand.nextInt(MAX) + 1;
  
	    System.out.println("**Welcome TO Number Guessing Game!!**\n\n");
	    System.out.println("To Start The game press 'Y'");
		
	    ch=sc.next().charAt(0);;
	
	    if(ch=='Y')
	{
      	  while (!correct) {

	    
		
            System.out.println("Guess a number between 1 and 100: ");

            guess = sc.nextInt();

            if (guess > answer) {
                System.out.println("Number Entered is Large!!");
            }
  
            else if (guess < answer) {
                System.out.println("Number Entered is Small!!");
            }

            else {
  
                System.out.println(
                    "Yes, you guessed the number.");
  
                correct = true;
            }
	}
        }
        System.exit(0);
    }
}
