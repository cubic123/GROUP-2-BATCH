package assainment12;

public class Press {
	private String department;
	private String name;
	private int id;
	Press(String d,String n,int i){  //Constructor;
		this.department=d;
		this.name=n;
		this.id=i;
		
		
	}
	public Press() {
		System.out.println("This is Press Department");
	}
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Press [department=" + department + ", name=" + name + ", id=" + id + " ]";
	}

	

	

}
