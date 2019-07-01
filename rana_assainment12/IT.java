package assainment12;

public class IT {
	String name=Newspaper.name;
	String department=Newspaper.department;
	int id=Newspaper.id;
	int age=Newspaper.age;
	IT(String d,String n,int i,int g){  //Constructor;
		department=d;
		name=n;
		id=i;
		age=g;
		
	}

	public   void it(String department) {  //method;
		
		System.out.println("department="+department);
		
		
		
	}
	public   void it(String department,String name) { //method;
		
		System.out.println("department="+department);
		System.out.println("Name="+name);
		
		
	}
	  public void it(String d,String n,int i,int g) { //method;
		
		
		System.out.println("department="+department);
		System.out.println("Name="+name);
		System.out.println("ID="+id);
		System.out.println("age="+g);
		System.out.println("\n\n");
		
		
	
	}

}
