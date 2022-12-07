//<Bar Chart> -- A simple bar chart 
//CSIS 212-<Week 3/Fall D>
public class BarChart {

	public static void main(String[] args) {
		
		System.out.println ("Tirza Wilson Assignment # 3: BarChart");
		
		System.out.printf("%s%10s%n", "Number", "Bar");
		for (int i = 1; i<=5; i++) {
			System.out.printf("%s%15s%n", i, "*".repeat(i));
//			System.out.print(i);
		}
		
	}

}
