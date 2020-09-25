package eg2;

public class Main {

	public static void main(String[] args) {
		Person person=new Person(100, "Sachin");
		System.out.println(person);
		
		Address a=new Address(188888, "XYZ Street Name", "San Fan", "Kansas", 1222222);
		Employee employee=new Employee(102, "Raj", "Manager", 123344.44d);
		employee.setPermenantAddress(a);
		System.out.println(employee);
		
		Player player=new Player(900, "Chris Morris", 100, "Cricket");
		System.out.println(player);

	}

}
