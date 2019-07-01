package assainment12;

public class Press {
	String name=Newspaper.name;
	String department=Newspaper.department;
	int id=Newspaper.id;
	int age=Newspaper.age;
	
	
	Press(String d,String n,int i,int g){  //Constructor;
		department=d;
		name=n;
		id=i;
		age=g;
		
	}

	public   void press(String department) { //method;
		
		System.out.println("department="+department);
		
		
		
	}
	public   void press(String department,String name) { //method;
		
		System.out.println("department="+department);
		System.out.println("Name="+name);
		
		
	}
	  public void press(String d,String n,int i,int g) { //method;
		
		
		System.out.println("department="+department);
		System.out.println("Name="+name);
		System.out.println("ID="+id);
		System.out.println("age="+g);
		System.out.println("\n\n");
		
		
	
	}
		

}
