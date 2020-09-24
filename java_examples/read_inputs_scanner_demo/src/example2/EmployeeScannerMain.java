package example2;

import java.util.Scanner;

public class EmployeeScannerMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Details");
		System.out.println("------------------------");
		System.out.println("Enter name");
		String name=sc.nextLine();
		System.out.println("Enter age");
		int age=Integer.parseInt(sc.nextLine());
		System.out.println("Enter salary");
		double salary=Double.parseDouble(sc.nextLine());
		System.out.println("Enter gender(m/f/o)");
		char gender=sc.nextLine().charAt(0);
		
		Employee e1=new Employee(name, salary, gender, age);
		System.out.println(e1);

	}

}
