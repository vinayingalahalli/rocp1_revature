package functional_interfaces_lambda_demo;

public class HelloFunctionalOldStyle implements HelloFunctional {

	public static void main(String[] args) {
		HelloFunctional h=new HelloFunctionalOldStyle();
		h.hello();
		
		HelloFunctional h2=new HelloFunctional() {
			
			@Override
			public void hello() {
				// TODO Auto-generated method stub
				System.out.println("Old style");
			}
		};
		h2.hello();

	}

	@Override
	public void hello() {
		System.out.println("Hello helloooo");
	}

}
