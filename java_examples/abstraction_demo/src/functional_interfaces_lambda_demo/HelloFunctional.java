package functional_interfaces_lambda_demo;

@FunctionalInterface
public interface HelloFunctional {

	void hello();
}

@FunctionalInterface
 interface Addition{
	int sum(int a ,int b,int c);
}