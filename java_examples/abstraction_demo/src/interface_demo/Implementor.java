package interface_demo;

public class Implementor implements MyInterface1,MyInterface2 {

	@Override
	public void myMethod1() {
		// TODO Auto-generated method stub
		System.out.println("method1 of MyInterface1");
	}

	@Override
	public void myMethod2() {
		// TODO Auto-generated method stub
		System.out.println("method2 of MyInterface1");
	}

	@Override
	public void myMethod3() {
		// TODO Auto-generated method stub
		System.out.println("method3 of MyInterface1");
	}

	@Override
	public void method6() {
		// TODO Auto-generated method stub
		System.out.println("method6 of MyInterface2");
	}

	@Override
	public void method7() {
		// TODO Auto-generated method stub
		System.out.println("method7 of MyInterface2  x= "+x);
	}

	@Override
	public void common() {
		// TODO Auto-generated method stub
		System.out.println("common for MyInterface1, MyInterface2");
	}

}
