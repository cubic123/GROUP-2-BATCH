package hemantjava1;

public class Primenumber {
	public static void main(String[] args) {
		int no = 7; int p=0;
		for(int i=2;i<no-1;i++) {
			if (no%i==0) {
			
			 p = p+1;
			}
			}
	
			
			if(p==0) {
				System.out.println(no+ ":is prime number");
				
			}
			else {	
				System.out.println(no+":is not a prime"); 
			}
		
				
			} 
}
		
		
