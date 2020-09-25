package interface_demo;

public class Main {

	public static void main(String[] args) {

		MyInterface1 m1 = new Implementor();
		System.out.println("Accessing using Myinterface1's reference");
		m1.common();
		m1.myMethod1();
		m1.myMethod2();
		m1.myMethod3();
		
		MyInterface2 m2 = new Implementor();
		System.out.println("\n\nAccessing using Myinterface2's reference");
		m2.common();
		m2.method6();
		m2.method7();
		

	}

}
