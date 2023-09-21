package StringJoinerex;

public class Game {
    String name;
    int ranking;
	public Game(String name, int ranking) {
		super();
		this.name = name;
		this.ranking = ranking;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

}
