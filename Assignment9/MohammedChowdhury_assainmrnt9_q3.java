package assainment9;

public class MohammedChowdhury_assainmrnt9_q3 {
	public static void main(String[]args) {
		System.out.println(part1());
		
	}
	public static int part1() {
		   for(int i=0;i<15;i++) {
		         for(int j=0;j<15-i;j++) {
		        	 System.out.print(" ");
		         }
		        for(int k=0;k<=i;k++) {
		            System.out.print(" *");
		        }
		        System.out.println();  
		    }

		
		return 0;
		
	}

}

