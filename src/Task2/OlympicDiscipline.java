package Task2;

public class OlympicDiscipline implements OlympicTeam {

	private String name;
	private int teamSize;
	private int goldMedals;

	public OlympicDiscipline(String name, int teamSize, int goldMedals) {
		super();
		this.name = name;
		this.teamSize = teamSize;
		this.goldMedals = goldMedals;
	}

	@Override
	public void showAthletes() {
		System.out.println("Team: " + name + ", Number of Athletes: " + teamSize);

	}

	@Override
	public void showMedals() {
		System.out.println("Team: " + name + ", Number of Medals: " + goldMedals);

	}

}
