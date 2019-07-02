package assainment12;

public class Admin {
	private String name;
	private String department;
	private int id;
	
	public Admin(String d,String n,int i){  //Constructor;
		department=d;
		name=n;
		id=i;
		
		
	}
	public Admin() {
		System.out.println("This is Admin Department");
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
		return "Admin [name=" + name + ", department=" + department + ", id=" + id +  "]";
	}
	public static void main(String[] args) {
		Accounts a=new Accounts();
		Accounts ac=new Accounts("Accounts", "rana", 26);//Constructor calling;
	System.out.println(ac.toString());
		Press p=new Press();
		Press pr=new Press("press", "Nitol", 85); //Constructor calling;
		System.out.println(pr.toString());
		Admin l=new Admin();
		Admin ad=new Admin("Admin", "Liton", 65);
		System.out.println(ad.toString());
		Engineering e=new Engineering();
		Engineering en= new Engineering("engineering","kamal",42,46);
		System.out.println(en.toString());
		IT h=new IT();
		IT i=new IT("IT", "Faruk", 32, 30);
		System.out.println(i.toString());
		
		

	}

	
	

	
}
