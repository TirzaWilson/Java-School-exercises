import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle recTest = new Rectangle();

        recTest.setLengthWidth(2.1, 21);

        if (recTest.getLength() <= 0 || recTest.getLength() >= 20){
            throw new IllegalArgumentException("Width must be between 0.0 and 2.0");
        }
        if (recTest.getWidth() <= 0 || recTest.getWidth() >= 20){
            throw new IllegalArgumentException("Width must be between 0.0 and 2.0");
        }

        int userChoice;
        Scanner myObj = new Scanner(System.in);
        System.out.print("1. Set Length \n2. Set Width \n3. Exit \nChoice: ");
        userChoice = myObj.nextInt();

        if (userChoice == 1){
            System.out.println("Rectangle length: " + recTest.getLength());
        } else if (userChoice == 2) {
            System.out.println("Rectangle width: " + recTest.getWidth());
        } else if (userChoice == 3) {
            System.out.println("Rectangle area: " + recTest.area());
            System.out.println("Rectangle Perimeter: " + recTest.perimeter());
        } else {
            System.out.println("That was not an option. Please try again.");
        }

    }
}
