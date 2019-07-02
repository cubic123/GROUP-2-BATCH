package assainment12;

public class Engineering {
	private String name;
	private String department;
	private int id;
	
	
	
	public Engineering(String d,String n,int i,int g){
		department=d;
		name=n;
		id=i;
		
		
	}
	public Engineering() {
		System.out.println("This is Engineering Department");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Engineering [name=" + name + ", department=" + department + ", id=" + id + "]";
	}
	
	


	}


