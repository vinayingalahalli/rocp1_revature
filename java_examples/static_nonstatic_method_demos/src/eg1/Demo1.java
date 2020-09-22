package eg1;

import eg2.Animal;



public class Demo1 {

	public void helloNonStatic() {
		System.out.println("Hello from non static block");
	}
	
	public void helloNonStaticAgain() {
		System.out.println("Hello from non static block again");
	}
	public static void main(String[] args) {
		
		//Classname obj=new Constructor();
		Demo1 d=new Demo1(); //dynamic memory allocation is happening in the heap
		d.helloNonStatic(); //execution
		d.helloNonStaticAgain();
		helloStatic();//static method of same class
		
		//Classname.methodName()
		Calculator.calculatorStatic(); //static method of different class
		
		Calculator c=new Calculator();
		c.calculatorNonStatic();
		int res=c.add(100, 299);
		System.out.println("result is "+res);
		System.out.println("result is "+c.add(9999, 99));
		int x=1000;
		int y=9999;
		
		System.out.println("result is :  "+c.add(x, y));
		System.out.println("result of add(float,float) "+c.add(22.9f, 33.2f));
		System.out.println("result of add(int,int,int)"+c.add(200, 100, 222));
		
		Animal.helloAnimalStatic();
		Animal a=new Animal();
		a.helloAnimalNonStatic();
	}
	
	public static void helloStatic() {
		System.out.println("Hello from helloStatic() method");
	}
	
	//all the classes which falls under java.lang package will be
	//imported directly.... like eg : String,System 

}
