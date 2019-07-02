package assainment12;

public class IT {
	private String name;
	private String department;
	private int id;

	public IT(String d,String n,int i,int g){  //Constructor;
		department=d;
		name=n;
		id=i;
		
		
	}
	public IT(){
		System.out.println("This is IT Department");
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
		return "IT [name=" + name + ", department=" + department + ", id=" + id + "]";
	}
	

}
