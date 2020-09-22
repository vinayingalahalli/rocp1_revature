package eg4;

public class Student {

	int id;
	String name;
	int age;
	public final static String COLLEGE="Revature College";
	
	public void printStudent() {
		System.out.println("Student Id : "+id);
		System.out.println("Student Name : "+name);
		System.out.println("Student Age : "+age);
		System.out.println("College Name : "+COLLEGE);
		//college="adsk";
	}
}
