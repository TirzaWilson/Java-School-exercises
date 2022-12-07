//<DiceRolling> -- This program simulates rolling dice 36,000 times
//CSIS 212-<week 5 Fall D>
import java.security.*;
public class diceRolling {

    static int di() {

        SecureRandom randomNumbers = new SecureRandom();

        return 1 + randomNumbers.nextInt(6);
    }

    public static void main(String[] args) {
    	
    	System.out.println("Tirza Wilson Assignment #5: Dice rolling!");
    	
        int[] frequency = new int[13];

        for (int roll = 1; roll <= 36000; roll++) {
            ++frequency[di() + di()];

        }
        System.out.printf("%s%10s%n", "Value", "Frequency");

        for (int value = 2; value < frequency.length; value++) {

        System.out.printf("%4d%10d%n", value, frequency[value]);

        }

    }

}