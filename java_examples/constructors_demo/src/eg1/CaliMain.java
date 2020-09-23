package eg1;

public class CaliMain {

	public static void main(String[] args) {

		
		Calci c = new Calci("JAVA");//Calci(String)

		System.out.println("Result with c is  " + c.add());

		
		Calci c1=new Calci(10, 999);
		System.out.println("Result with c1 add() is "+c1.add());
		System.out.println("Result with c1 multiply() is "+c1.multiply());
		
		Calci c2=new Calci(66, 66);
		System.out.println("Result with c2 add() is "+c2.add());
		System.out.println("Result with c2 multiply() is "+c2.multiply());
		
	}

}
