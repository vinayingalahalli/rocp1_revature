package override_equals_method;

public class Player {

	private int id;
	private String name;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + "]";
	}

	public Player(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	public boolean equals(Object o) {
		boolean b=false;
		Player p2=(Player)o;
		if(this.id==p2.id) {
			b=true;
		}
		return b;
	}
	
}
//Imitate above behavior for employee class for checking if 2 employees id are same or not
