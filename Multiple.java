//<Multiple> -- This program generates random numbers and determines if they the first is a multiple of the second. 
//CSIS 212-<Week 4/Fall D>
import java.security.*;
public class Multiple {

	static void isMultiple(int num1, int num2) {
		
		int formula = num2 % num1;
		boolean result = formula == 0;
//		System.out.println(result);
		System.out.printf("[%d, %d] ", num1, num2);
		System.out.printf("%d is a multiple of %d: %b %n", num2, num1, result);
		
	}
			
	
	public static void main(String[] args) {
		
		System.out.println ("Tirza Wilson Assignment # 4: Multiple");
		
		SecureRandom randomNumbers = new SecureRandom ();
		
		int min = 1;
		int max = 10;
		
		for(int i = 0; i < 5; i++) {	
			
			int rndNum1 = randomNumbers.nextInt(max-min+1)+min;
			
			int rndNum2 = randomNumbers.nextInt(max-min+1)+min;
			isMultiple(rndNum2, rndNum1);
		}
		
	}

}
