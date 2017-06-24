// 09/23/2011

import java.util.Random;
import java.util.Scanner;

public class CoinFlip {
	public static void main(String[] args) {
		Random generator = new Random();
		
		int value = generator.nextInt(10); 	// Between 0 and 9
		int value2 = generator.nextInt(10) + 1; 	//Between 1 and 10
		// System.out.println(value);
		
		String playagain = "yes";
		
		// Heads or Tails (Coin Flip)
		
		while (playagain.equalsIgnoreCase("yes")) {
			
			int result = generator.nextInt(2); 	// H (0) or T (1)
		
		// Taking the user's selection
			Scanner scan = new Scanner(System.in);
			String selection;
			System.out.print("\nEnter heads or tails:");
			selection = scan.nextLine();
		
		// Printing the result
			if (result == 0)
				System.out.println("Coin flip is heads.");
			else
				System.out.println("Coin flip is tails.");
		
		// Print won or lost
			if (	(result == 0 && selection.equalsIgnoreCase("heads")) ||
					(result == 1 && selection.equalsIgnoreCase("tails"))	 )
				System.out.println("You won!");
			else
				System.out.println("Sorry! Try again.");
		
			System.out.print("Play again (yes/no)? ");
			playagain = scan.nextLine();
	
			
		}
		
	}
}