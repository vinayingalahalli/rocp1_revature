package eg1;

public class Calci {

	private int x;
	private int y;
	
	public Calci(String name) {
		
		System.out.println("Hello Constructor "+name);
	}
	
	public Calci(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	public int add() {
		return x+y;
	}
	
	public int multiply() {
		return x*y;
	}
}
