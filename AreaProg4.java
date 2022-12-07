//<Area of a circle> -- This program takes user input (radius) and determines the area of the circle.
//CSIS 212-<Week 4/Fall D>
import java.util.Scanner ;
import java.lang.Math;
public class AreaProg4 {
	
	static double circleArea(double radiusInput) {
		
		return Math.PI * Math.pow(radiusInput, 2);
	}
	
	public static void main(String[] args) {
		
		System.out.println ("Tirza Wilson Assignment # 4: Area");
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Please enter the radius of a circle ");
		
		double num = input.nextDouble();
		
		double result = circleArea(num);
		
		
		System.out.print("The area of the circle is " + result);
		
	}

}
