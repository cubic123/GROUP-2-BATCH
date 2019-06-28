
package methodPratice;
import java.util.Scanner;
public class Calculator{		
		
 public int add(int x,int y) {
	 return x+y;
	}
 public int subtract(int x, int y) {
	return x-y;
	}
 public int multiply(int x, int y) {
	return x*y;
}
 public int division(int x,int y) {
	return x/y;
}
 public int mod(int x,int y) {
	return x%y;
	
}
public int add(int x,int y,int z) {
	return x+y+z;
	
}
 public int subtract(int x,int y,int z) {
	return x-y-z;
	
}
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

	

