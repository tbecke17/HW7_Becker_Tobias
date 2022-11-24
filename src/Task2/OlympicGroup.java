package Task2;

import java.util.ArrayList;

public class OlympicGroup implements OlympicTeam {

	private String name;
	private ArrayList<OlympicTeam> teams;

	public OlympicGroup(String name) {
		super();
		this.name = name;
		teams = new ArrayList<OlympicTeam>();
	}

	public void addOlympicTeam(OlympicTeam team) {
		teams.add(team);
	}

	public ArrayList<OlympicTeam> getOlympicTeam() {
		return teams;
	}

	@Override
	public void showAthletes() {
		System.out.println(name);

		for (int i = 0; i < teams.size(); i++) {
			teams.get(i).showAthletes();
		}

	}

	@Override
	public void showMedals() {
		System.out.println(name);

		for (int i = 0; i < teams.size(); i++) {
			teams.get(i).showMedals();
		}

	}

}
