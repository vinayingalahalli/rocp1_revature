package loops_demo;

public class EntryControlledLoopDemo {

	public static void main(String[] args) {
		
		//loop is a block of code which is executed repeatedly until certain condition is met	
		//Entry Controlled is where the condition will be checked first and then the body of loop is executed
	
		//for... , for-each loop and while loop
		
		//for(initialization; condition; increment/decrement){}
		
		System.out.println("example-1  for");
		for(int i=0;i<=10;i+=2) {
			System.out.println("i = "+i);
		}
		
		System.out.println("\nexample-2 for");
		for(int i=10;i>=0;i-=2) {
			System.out.println("i = "+i);
		}
		System.out.println("\nexample-3 for");
		for(int i=0,j=10;i<=10;i+=2,j--) {
			System.out.println("i = "+i +" j = "+j);
		}
		
		//for - each loop
		/*
		 * it starts from the top of any data structures like Array, List Map, Set and goes till end
		 */
		System.out.println("\nexample for-each");
		int ages[]= {22,33,11,33,44,77,55,10};
		for(int x:ages) {
			System.out.println(x);
		}
		
		System.out.println("\nexample while-loop");
		int r=1;
		while(r!=10) {
			
			System.out.println("r = "+r);
			r++;
		}
		
	}

}
