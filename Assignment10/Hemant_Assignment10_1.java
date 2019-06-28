package oops;

public class School {
	
static void Classfive() {
	
	System.out.println("Hello kamal well come");
	}
public static void main(String[] args) {
	Classfive();
		
Student hd = new Student();
hd.myStudent();

	
}
}




package oops;

public class Department {
	static void myDepartment() {
		String East =" science";
		System.out.println("FirstDept: " + East);
	
	}
	static void yourDepartment()	{
		String West = "Commerce";
		System.out.println( "SecondDept: " + West);
		
		
		
	}
	public static void main(String[] args) {
		myDepartment();
		yourDepartment();
		
		
		}
	
}





package oops;

public class Professor {
	public void myProfessor()  {	
	int id = 007;
	String Firstname =" Vivek";
	String Lastname = "Shrestha"; 
	System.out.println("id no " + id);
	System.out.println("Name "+ Firstname);
	System.out.println("SurName "+ Lastname);
	
	}
	
	
	
	public static void main(String[] args) {
		Department meroDept = new Department();
		meroDept.myDepartment();
		Professor HD = new Professor();
		HD.myProfessor();
		
	}

}










package oops;

public class Student {
	static void myStudent() {
	
int id = 2;
String FirstName="Kamal" ;
String LastName="Dahal";
String Address="4203 Blake lane";
System.out.println("id ="+id);
System.out.println("Name ="+FirstName);
System.out.println("surname ="+LastName);
System.out.println("ADDRESS ="+Address);
}
	public static void main(String[] args) {
		
		
		myStudent();
	}
	}

