import java.util.Scanner;

public class Rana_assignment6 {

	private static Scanner x;

	public static void main(String[] args) {
		int a,b,sum,rem;
		x = new Scanner (System.in);
		
		System.out.print("Enter The value of a:");
		a=x.nextInt();
		System.out.print("Enter The value of b:");
		b=x.nextInt();
		
		
		sum=a+b;
		rem=a%b;
				System.out.println("summetion of Two Number is :"+sum);
				System.out.println("Reminder of a and b value is : "+rem);
		
		
				if (a <= b) {
					System.out.println("good ideas");
				}
				else {
					System.out.println("bad ideas");
				}
		}

	}
