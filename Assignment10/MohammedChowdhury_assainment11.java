package assainment10;

import java.util.Date;

public class MohammedChowdhury_assainment11 {
	static int a=10;
	static int b=20;
	static String name="rana";
	static char gender='A';
	static Date date=new Date();
	static double sal=100000.00;

	public static void main(String[] args) {
		
add();
multiplication();
MohammedChowdhury_assainment11 d=new MohammedChowdhury_assainment11();
d.summation(a,b);
MohammedChowdhury_assainment11 l=new MohammedChowdhury_assainment11();
l.name3(name);
MohammedChowdhury_assainment11 s=new MohammedChowdhury_assainment11();
s.salary();

MohammedChowdhury_assainment11 g=new MohammedChowdhury_assainment11();
g.Gender();
MohammedChowdhury_assainment11 m=new MohammedChowdhury_assainment11();
m.mod();
	}
	public static int add() {
		Date z=MohammedChowdhury_assainment11.date;
		System.out.println(z);
		
		
		MohammedChowdhury_assainment11 d=new MohammedChowdhury_assainment11();
		d.summation(a,b);
		
		
		

		
	
		
		return 0;
		
	}
	public static int multiplication() {
		int mul1= MohammedChowdhury_assainment11.a;
		int mul2= MohammedChowdhury_assainment11.b;
		int multi=mul1*mul2;
		System.out.println("The multiplication of 2 value in 2nd mathod: "+multi);
		add();
		
		MohammedChowdhury_assainment11 d=new MohammedChowdhury_assainment11();
		d.summation(a,b);
		
		

		
		
		return 0;
		
		
		
	}
	public void Gender() {
		char g= MohammedChowdhury_assainment11.gender;
		System.out.println(g);
		add();
		multiplication();
		MohammedChowdhury_assainment11 d=new MohammedChowdhury_assainment11();
		d.summation(a,b);
		
		

		
		
		
		
	}
public void summation( int add1,int add2) {
	 add1= MohammedChowdhury_assainment11.a;
	 add2= MohammedChowdhury_assainment11.b;
	int sum=add1+add2;
	
	System.out.println("The summation of 2 value in 1st mathod: "+sum);
	
	
	
	}
public void name3(String name) {
	name= MohammedChowdhury_assainment11.name;
	System.out.println(name);
	add();
	multiplication();
	MohammedChowdhury_assainment11 d=new MohammedChowdhury_assainment11();
	d.summation(a,b);
	
	

	MohammedChowdhury_assainment11 g=new MohammedChowdhury_assainment11();
	g.Gender();
	MohammedChowdhury_assainment11 m=new MohammedChowdhury_assainment11();
	m.mod();
	
	
	
}
public int salary() {
	
	double sal1=MohammedChowdhury_assainment11.sal;
	System.out.println(sal1);
	add();
	multiplication();
	MohammedChowdhury_assainment11 d=new MohammedChowdhury_assainment11();
	d.summation(a,b);
	
	

MohammedChowdhury_assainment11 g=new MohammedChowdhury_assainment11();
	g.Gender();
	
	
	return 0 ;
	
	
}
public int mod() {
	int k=60;
	int p=50;
	float mod1=k%p;
	System.out.println(mod1);
	add();
	multiplication();
	MohammedChowdhury_assainment11 d=new MohammedChowdhury_assainment11();
	d.summation(a,b);
	
	MohammedChowdhury_assainment11 s=new MohammedChowdhury_assainment11();
	s.salary();

	MohammedChowdhury_assainment11 g=new MohammedChowdhury_assainment11();
	g.Gender();
	
	
	return 0;
	
}
	
	

}
