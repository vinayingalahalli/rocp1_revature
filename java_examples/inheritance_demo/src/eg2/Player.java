package eg2;

public class Player extends Person {

	//Bring a has-A relationship here stating that Player plays for a Team(tid,teamName,coachName)inheritance
	private double score;
	private String sportName;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(int id, String name, double score, String sportName) {
		super(id, name);
		this.score = score;
		this.sportName = sportName;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getSportName() {
		return sportName;
	}

	public void setSportName(String sportName) {
		this.sportName = sportName;
	}

	@Override
	public String toString() {
		return "Player [score=" + score + ", sportName=" + sportName + ", getId()=" + getId() + ", getName()="
				+ getName() + "]";
	}
	
	
	
}
