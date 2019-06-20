package assainment9;

import java.util.Scanner;

public class MohammedChowdhury_assainment9_q14 {

	public static void main(String[] args) {
		
		part1();
		part2();

	}

	public static void part1() {
		Scanner name=new Scanner(System.in);
		System.out.print("Enter your name:");
		String a=name.nextLine();
		System.out.println("thanks Mr/Mrs "+a);
		
		System.out.print("where you would like to go today ? :");
		String b=name.nextLine();
		System.out.println(b+ " is a nice place to visit ");
		
	}
	public static void part2() {
		Scanner time=new Scanner(System.in);
		System.out.println("How much time and money you need for  budgeting for our trip?");
		System.out.println("How many days are you going to spend in your destination?:");
		int c= time.nextInt();
		
		System.out.println("What is your total budget for the trip in USD?:");
		float d=time.nextFloat();
		double eu=d*0.9;//usd to eu
		double day1=3.50;//per day pay
		double totaldaypay=c*day1;//total pay for all day
		double totalpay=d/totaldaypay;//how many money you can spend
		double day=c*86400;//day to sec
		
		
		
	}
}
