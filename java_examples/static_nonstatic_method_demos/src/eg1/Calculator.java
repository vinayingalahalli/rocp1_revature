package eg1;

public class Calculator {

	public static void calculatorStatic() {
		System.out.println("Hello from Calculator's class calculatorStatic()");
	}

	public void calculatorNonStatic() {
		System.out.println("Hello from Calculator's class calculatorNonStatic() method");
	}

	public int add(int a, int b) {
		// int res=a+b;
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}
	
	public float add(float a, float b) {
		// int res=a+b;
		return a + b;
	}
}
//add is overloaded above- 3types of add with unique argument/parameters list
//login(email,password)
//login(mobileno,password)
//login(socialaccount)
