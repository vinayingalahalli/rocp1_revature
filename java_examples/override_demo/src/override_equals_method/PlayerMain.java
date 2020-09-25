package override_equals_method;

public class PlayerMain {

	public static void main(String[] args) {
		
		Player p1=new Player(100, "Giri");
		System.out.println(p1);
		
		Player p2=new Player(101, "Giri");
		System.out.println(p2);
		
		if(p1.equals(p2)) {
			System.out.println("Both players are same");
		}else {
			System.out.println("Players are different");
		}
		
	}

}
