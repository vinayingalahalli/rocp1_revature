package loops_demo;

public class ExitControlledLoopDemo {

	public static void main(String[] args) {
		/*
		 * Exit controlled is do...while()
		 * where the body of the loop will be executed once for sure
		 */
		int ch=10;
		do {
			System.out.println("I will be executed once for sure");
		}while(ch!=10);
		
		
		while(ch!=10) {
			System.out.println("Iwill be executed only if condition matches");
		}

	}

}
