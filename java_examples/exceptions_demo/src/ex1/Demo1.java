package ex1;

public class Demo1 {

	public static void main(String[] args) {
		
		int a=10;
		int b=2;
		int res=0;
		
		try {
		res=a/b;
		System.out.println("Other lines in try");
		String s=null;
		System.out.println(s.length());
		}catch(ArithmeticException e) {
			System.out.println("you cannot divide by zero pls :) "+e);
		}catch(NullPointerException e) {
			System.out.println("Something is null or empty here");
		}
		
		finally {
			System.out.println("Result is "+res);
		}
		System.out.println("This is other LOC in my app");

	}

}
