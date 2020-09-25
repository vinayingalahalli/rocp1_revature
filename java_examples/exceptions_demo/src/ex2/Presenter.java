package ex2;

import java.io.FileNotFoundException;

public class Presenter {

	public static void main(String[] args) {
		Logic logic=new Logic();
		try {
			logic.openFile("hello.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		
		try {
		int res=logic.divide(10, 0);
		System.out.println("Result is "+res);
		}catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		}
	}

}
