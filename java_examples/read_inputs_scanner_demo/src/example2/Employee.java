package example2;

public class Employee {

	private int id;
	private String name;
	private double salary;
	private char gender;
	private int age;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, double salary, char gender, int age) {
	
		this.name = name;
		this.salary = salary;
		this.gender = gender;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + this.hashCode() + ", name=" + name + ", salary=" + salary + ", gender=" + gender + ", age=" + age
				+ "]";
	}
	
	
}
