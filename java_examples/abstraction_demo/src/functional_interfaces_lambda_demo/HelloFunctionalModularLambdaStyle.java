package functional_interfaces_lambda_demo;

public class HelloFunctionalModularLambdaStyle {

	public static void main(String[] args) {
	
		HelloFunctional h=()->System.out.println("hello lambda");
		h.hello();
		
		HelloFunctional h2=()->System.out.println("hello lambda again");
		h2.hello();
		
		
		Addition a=(x,y,z)->{
			return x+y+z;
			};
			System.out.println(a.sum(100, 33, 333));

	}

}
