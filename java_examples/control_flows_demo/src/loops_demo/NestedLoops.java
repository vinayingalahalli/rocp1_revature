package loops_demo;

public class NestedLoops {

	public static void main(String[] args) {
		
		System.out.println("Example-1");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("i = "+i+" j = "+j);
			}
		}
		
		System.out.println("\nExample-2");
		for (int i = 0; i < 3; i++) {
			int c=0;
			while(c!=3) {
				System.out.println("i = "+i+" c = "+c);
				c++;
			}
		}

	}

}
