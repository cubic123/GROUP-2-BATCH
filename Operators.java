public class Operators {
	
	public static void main(String [] args){
	
	
	    int num1 = 50;
		int num2 = 10;
		int a =  10;

		int b = 20;
		boolean x = true;
		boolean y = false;
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		System.out.println(a += b);
		num1++;
		num2--;
		++a;
		System.out.println("post increament: "+num1);
		System.out.println("post increament: "+num2);
		System.out.println("pre increament: "+a);
		System.out.println("x && y  "+ (x&&y));
		System.out.println("x || y  "+ (x||y));
		System.out.println("!x "+ (!x));

		if(num1 == num2){
		
		System.out.println("I am equal");

		} else {
		
		System.out.println("I am Not equal");
		}



	
	
	
	}



}
