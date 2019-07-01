package fiveclasses;

public class ButterChicken {
	int meat ;
	int masala ;
	
	public ButterChicken(int chk , int butter ) {
		meat = chk;
		masala = butter;
		}
	static void southstyle(int chk ) {
	
		System.out.println(chk );
	}
	public void southstyle(int meat,int chilly) {
		System.out.println(meat+" "+ chilly);
	}
	static int southstyle(int meat,int chilly, int ghee ) {
		int receipe= meat-chilly-ghee;
	return receipe;
	
	}
	public int southstyle(int foodcolor,int poyo,int onionsauce,int ghee) {
		int receipe = poyo+onionsauce+ghee;
		return receipe;
		
	}
public static void main(String[] args) {
	ButterChicken Ram = new ButterChicken(14,5);
	System.out.println(Ram.meat+ " "+ Ram.masala);
southstyle(19);
Ram.southstyle(19,14);
System.out.println(southstyle(17,14,19));
System.out.println(Ram.southstyle(12,13,13,16));


	

	
}
}

