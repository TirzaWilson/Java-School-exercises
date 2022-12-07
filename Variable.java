//<DiceRolling> -- This program calculates the product of all the integers in an array of random numbers
//CSIS 212-<week  Fall D>
import java.security.SecureRandom;
import java.util.Arrays;

public class Variable {

    static int listSum(int[] varList) {

        int sum = 1;

        for (int i = 0; i < varList.length; i++) {
        sum *= varList[i];

        }
        return sum;
    }

    public static void main(String[] args) {

    	System.out.println("Tirza Wilson Assignment #5: Variable-Length arguments!");
    	
        SecureRandom randomNumbers = new SecureRandom();

        int x = 2 + randomNumbers.nextInt(10);

        int[] list = new int[x];

        for (int i = 0; i < list.length; i++) {
            int y = 1 + randomNumbers.nextInt(10);
            list[i] = y;

        }
        System.out.printf("The poduct of the following integers %s = ", Arrays.toString(list));

        System.out.print(listSum(list));

    }

}
