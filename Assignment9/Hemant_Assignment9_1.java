ackage hemantjava1;
import java.util.Scanner;


public class Greeting {
	public static void main(String[] args) {
		Scanner Hemant = new Scanner(System.in);
		System.out.println("Enter your name");
		
		
		String username = Hemant.nextLine();
		System.out.println("where do you like to visit for this time?");
		
		String place = Hemant.nextLine();
		
		System.out.print("Good morning "+ username);
	
	
		System.out.print("   i love your choice-Nepal is Beauliful country" +   place);
		
	}
	
	
	
}

