package task1;
import java.util.Random;
import java.util.*;

public class Number_Gussing_Game {

	public static void main(String[] args) 
	{
		Random random = new Random();
		
		int targetNumber = random.nextInt(100) + 1;
		
	    boolean GuessCorrectly = false;
	    int Attempt = 0;
		
		System.out.println("*******Welcome to Number Gussing Game******");
		
		Scanner sc = new Scanner(System.in);
		
		while(!GuessCorrectly) {
		System.out.println("\nEnter Your Guess (between 1 to 100):");
		int userguess = sc.nextInt();
		
		Attempt++;
		
		if(userguess == targetNumber)
		{
			GuessCorrectly = true;
			System.out.println("Wow...Congratulations! You've guessed the correct number " + targetNumber + " in "
					+ Attempt + " Attempt...!");
		}
		else if(userguess < targetNumber)
		{
			System.out.println("Too Low...! Try Again");
		}
		else if(userguess > targetNumber)
		
			System.out.println("Too High...! Try Again");
		}
		
	}
	}

