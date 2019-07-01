package assainment12;

public class Admin {
	String name=Newspaper.name;
	String department=Newspaper.department;
	int id=Newspaper.id;
	int age=Newspaper.age;
	
	
	Admin(String d,String n,int i,int g){  //Constructor;
		department=d;
		name=n;
		id=i;
		age=g;
		
	}

	public   void admin(String department) { //method;
		
		System.out.println("department="+department);
		
		
		
	}
	public   void admin(String department,String name) { //method;
		
		System.out.println("department="+department);
		System.out.println("Name="+name);
		
		
	}
	  public void admin(String d,String n,int i,int g) { //method;
		
		
		System.out.println("department="+department);
		System.out.println("Name="+name);
		System.out.println("ID="+id);
		System.out.println("age="+g);
		System.out.println("\n\n");
		
		
	
	}
		
}
