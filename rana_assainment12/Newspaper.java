package assainment12;

public class Newspaper {
	static String name;
	static String department;
	static int id;
	static int age;
	

	public static void main(String[] args) {
		
		Accounts ac=new Accounts("Accounts", "rana", 26,28);//Constructor calling;
		ac.accounts(department,name,id,age);
		
		Press pr=new Press("press", "Nitol", 85,30); //Constructor calling;
		pr.press(department,name,id,age);
		
		Admin ad=new Admin("Admin", "Mehran", 12,24);//Constructor calling;
		ad.admin(department,name,id,age);
		
		Engineering en= new Engineering("engineering","kamal",42,46);//Constructor calling;
		en.engineering(department,name,id,age);
		
		IT i=new IT("IT", "Faruk", 32, 30); //Constructor calling;
		i.it(department,name,id,age);
		
		

	}

}
