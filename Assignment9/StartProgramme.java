package methodPratice;
import java.util.Scanner;


public class StartProgramme {
	
	public static void main(String[] args) {
		Scanner hd = new Scanner(System.in);
		System.out.println("Enter first input");
		int x = hd.nextInt();
		System.out.println("Enter Second input");
		int y = hd.nextInt();
		System.out.println("Enter third input");
		int z = hd.nextInt();
		Calculator sk = new Calculator();
		System.out.println(sk.add(x, y));
		System.out.println(sk.subtract(x, y));
		System.out.println(sk.multiply(x, y));
		System.out.println(sk.division(x, y));
		System.out.println(sk.mod(x, y));
		System.out.println(sk.add(x, y, z));
		System.out.println(sk.subtract(x, y, z));
	}

}

