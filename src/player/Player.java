package player;

public class Player {
	
	private String name;
	private int score;
	private int id;
	private boolean activeTurn;
	
	public Player(String name, int id, int initialScore) {
		this.name =  name;
		this.id =  id;
		this.score = initialScore;
		this.activeTurn = false;
	}

	public boolean isActiveTurn() {
		return activeTurn;
	}

	public void setActiveTurn(boolean activeTurn) {
		this.activeTurn = activeTurn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
