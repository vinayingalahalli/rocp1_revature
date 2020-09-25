package ex1;

public class PlayerMain {

	public static void main(String[] args) {
		
		Player p1=new Player(100, "Kunal", 22);
		
		System.out.println(p1);
		
		Player p2=new Player();
		p2.setId(101);
		p2.setName("Yuvraj");
		p2.setAge(28);
		System.out.println(p2);
		
		p2.setName("Yuvraj Singh");
		
		System.out.println("Updated name of p2 is "+p2.getName());

		System.out.println("Name of Player p1 obj is "+p1.getName());
	}

}
