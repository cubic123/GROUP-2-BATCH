public class University {
	
	University(){
		double a = 150;
		int b = 5;
		
		System.out.println("University Constructor created.");
	}
	
	University u = new University ();

	public void Professor() {
		System.out.println("This is Professor method.");
	}
	public String Professor(String Student){
		return Student;
		}

	public int Professor(int yearEnrolled, int rollNumber){
		return yearEnrolled;
	
	}
}

