import java.util.Scanner ;
import java.lang.Math;
public class Area {
	
	static double circleArea(double radiusInput) {
		
		return Math.PI * Math.pow(radiusInput, 2);
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Please enter the radius of a circle ");
		
		double num = input.nextDouble();
		
		double result = circleArea(num);
		
		
		System.out.print("The area of the circle is " + result);
		
	}

}
