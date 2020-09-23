package eg2;

public class Employee {

	private int id;
	private String name;
	private double salary;
	private String email;
	private long contactNo;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	

	public Employee(int id, String name, double salary, String email, long contactNo) {
		this(id,name,salary); //Constructor Chaining
		this.email = email;
		this.contactNo = contactNo;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", email=" + email + ", contactNo="
				+ contactNo + "]";
	}

	
	
	
//	@Override //Annotation
//	public String toString() {
//		return "hello "+name;
//	}
	
	
	//Mimic the same example replace Employee with Product(id,name,rating,cost)
	
	
}
