//<Multiplication generator> -- This program generates multiplication math problems, using the random number generator.
//CSIS 212-<Week 4/Fall D>
import java.security.*;
import java.util.Scanner;
public class ComputerAI {
	
	static void myFunction() {
		SecureRandom randomNumbers = new SecureRandom ();
		
		
		int x = randomNumbers.nextInt(10);
		
		int y = randomNumbers.nextInt(10);
		
		System.out.printf("What is %d times %d?: ", x,  y);
		
		int answer = x * y ;
		
		Scanner input = new Scanner (System.in);

		
		int ansInput = input.nextInt ();
	
		
		if (ansInput == answer){
			System.out.println("Very Good!");	
		}
		else {
			while(ansInput != answer) {
				System.out.println("Incorrect. Please try again");
				System.out.printf("What is %d times %d?: ", x,  y);
				int ansNextInput = input.nextInt ();
				if (ansNextInput == answer) {
					System.out.println("Very Good!");
					break;
				} else {
					
				}
				
			}

			
		}
		
	}
		
		
	public static void main(String[] args) {
	
		System.out.println ("Tirza Wilson Assignment # 4: Math is fun!");
		
		while(true) {
			myFunction();
			
		}

	}

}
