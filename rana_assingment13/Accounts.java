package assainment12;

public class Accounts {
	private String department;
	private String name;
	private int id;
	public Accounts(String d,String n,int i){  //Constructor;
		this.setDepartment(d);
		this.setName(n);
		this.setId(i);
		
		
	}
	public Accounts(){
		System.out.println("This is Accounts Department");
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


	@Override
	public String toString() {
		return "Accounts [department=" + department + ", name=" + name + ", id=" + id + "]";
	}


	public void setId(int id) {
		this.id = id;
	}

	
		


}
