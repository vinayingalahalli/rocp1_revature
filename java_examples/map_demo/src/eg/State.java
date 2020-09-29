package eg;

public class State {

	private int id;
	private String name;
	
	public State() {
		// TODO Auto-generated constructor stub
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

	@Override
	public String toString() {
		return "State [id=" + id + ", name=" + name + "]";
	}

	public State(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
