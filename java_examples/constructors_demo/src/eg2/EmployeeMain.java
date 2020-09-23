package eg2;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee e=new Employee(100, "Dave", 12212.22);
		System.out.println(e);
//		System.out.println(e.toString());
//		System.out.println(e.hashCode());
		
		Employee e1=new Employee(101, "Steve", 1212199.99);
	//	System.out.println(e1.hashCode());
		System.out.println(e1);
		
		
		Employee e2=new Employee(102, "Eric", 1237888.99, "eric@gmail.com", 1234567890L);
		System.out.println(e2);
	}

}
