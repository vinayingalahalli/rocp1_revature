package ex1;
/*
 * 1)Encapsulated Class
 * 2)Model Class in MVC(model-view-controller)
 * 3)POJO(Plain Old Java Object) Class
 * 4)DTO(Data Transfer Object) Class
 * 5)VO(Value Object) Class
 * 6)Bean class
 */
public class Player {

	private int id;
	private String name;
	private int age;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
