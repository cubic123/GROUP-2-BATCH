public class MohammedChowdhury_assainmrnt9_q3 {
	public static void main(String[]args) {
		part1();
		
	}
	public static void  part1() {
		for(int i=0;i<=10;i++) {
		    for(int j=1;j<=10-i;j++)
		     System.out.print(" ");
		     for(int j=1;j<=2*i-1;j++)
		       System.out.print("*");
		     System.out.print("\n");
		}
		 
		   for(int i=10-1;i>=1;i--) {
		   
		     for(int j=1;j<=10-i;j++)
		     System.out.print(" ");
		     for(int j=1;j<=2*i-1;j++)
		       System.out.print("*");
		     System.out.print("\n");
		   }
		 
		}
		
}


