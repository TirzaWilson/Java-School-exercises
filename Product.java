//<Product> -- This program calculates the product of all the odd integers between 1 and 15
//CSIS 212-<week 3 Fall D>
public class Product {

	public static void main(String[] args) {
        
		System.out.println("Tirza Wilson Assignment #3: Product");
		
		int product = 1;

        for(int number=0; number<=15; number++){
            if(number % 2 != 0)
                product *= number;
        }

        System.out.printf("The product of the odd integers from 1 to 15 is: %d\n", product);
		 

	}

}
