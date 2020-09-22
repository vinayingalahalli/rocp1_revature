package if_demo;

public class DemoIfElse {

	public static void main(String[] args) {
	
		int x=3;
		if(x==2) {
			System.out.println("Yes its 2");
		}else {
			System.out.println("No its not 2");
		}
		
		int d=111; 
		if(d>=55 && d<=110) {
			System.out.println("Yes its between 55 and 110");
		}else {
			System.out.println("No d is not between 55 and 110");
		}
		
		int score=90;
		if(score == 100) {
			System.out.println("Top score");
		}else if(score>=70 && score<=99) {
			System.out.println("First class score");
		}else if(score>=50 && score<=69) {
			System.out.println("Just below first class score");
		}else {
			System.out.println("Let's retry");
		}
		

	}

}
