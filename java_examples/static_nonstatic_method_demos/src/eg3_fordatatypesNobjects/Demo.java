package eg3_fordatatypesNobjects;

public class Demo {

	int x; //global instance(object) level
	int y; //global instance(object) level
	static int z; //global class level
	String name;
	
	
	public static void main(String[] args) {
		
		Demo d1=new Demo();
		d1.x=99;
		d1.y=100;
		d1.name="My Name";
		z=99999;
		System.out.println("Printing xyz with d1 object");
		d1.printXYZ();
		
		Demo d2=new Demo();
//		d2.x=99;
//		d2.y=100;
		System.out.println("\nPrinting xyz with d2 object");
		d2.printXYZ();
		d2.x=88;
		z=1009;
		
		
		
		System.out.println("\nPrinting xyz with d1 object again");
		d1.printXYZ();
		
		System.out.println("\nPrinting xyz with d2 object again");
		d2.printXYZ();
		
		Demo d3=new Demo();
		
		System.out.println("\nPrinting xyz with d3 object ");
		d3.printXYZ();
		
	}
	
	public void printXYZ() {
		System.out.println("Value of x = "+x);
		System.out.println("Value of y = "+y);
		System.out.println("Value of z = "+z);
		System.out.println("Value of name = "+name);
	}

}
