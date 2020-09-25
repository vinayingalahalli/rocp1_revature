package ex2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Logic {

	public void openFile(String fileName) throws FileNotFoundException  {
		FileInputStream fis=new FileInputStream(fileName);
	}
	
	
	public int divide(int x,int y) throws ArithmeticException,NullPointerException{
		return x/y;
	}
}
