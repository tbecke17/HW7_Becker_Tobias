package Task2;

public class OlympicKomittee {

	public static void main(String[] args) {
		OlympicGroup olympicsTeam = new OlympicGroup("Olympics Teams");

		OlympicGroup asiaTeam = new OlympicGroup("Asia Team");
		OlympicGroup africaTeam = new OlympicGroup("Africa Team");
		OlympicGroup europeTeam = new OlympicGroup("Europe Team");
		OlympicGroup southAmericaTeam = new OlympicGroup("South America Team");

		OlympicGroup chinaTeam = new OlympicGroup("China Team");
		OlympicGroup afghanistanTeam = new OlympicGroup("Afghanistan Team");
		OlympicGroup germanyTeam = new OlympicGroup("Germany Team");
		OlympicGroup italyTeam = new OlympicGroup("Italy Team");

		OlympicGroup chinaWomenTeam = new OlympicGroup("China-Women");
		OlympicGroup chinaMenTeam = new OlympicGroup("China-Men");
		OlympicGroup germanyWomenTeam = new OlympicGroup("Germany-Women");
		OlympicGroup germanyMenTeam = new OlympicGroup("Germany-Men");
		OlympicGroup italyWomenTeam = new OlympicGroup("Italy-Women");
		OlympicGroup italyMenTeam = new OlympicGroup("Italy-Men");

		chinaWomenTeam.addOlympicTeam(new OlympicDiscipline("Women's Teakwondo", 4, 1));
		chinaWomenTeam.addOlympicTeam(new OlympicDiscipline("Women's Waterpolo", 9, 5));
		chinaWomenTeam.addOlympicTeam(new OlympicDiscipline("Women's Artistic Gymnastics", 6, 2));
		chinaMenTeam.addOlympicTeam(new OlympicDiscipline("Men's Shooting", 5, 2));
		germanyWomenTeam.addOlympicTeam(new OlympicDiscipline("Women's Cycling", 10, 1));
		germanyWomenTeam.addOlympicTeam(new OlympicDiscipline("Women's Tennis", 6, 2));
		germanyMenTeam.addOlympicTeam(new OlympicDiscipline("Men's TableTennis", 4, 1));
		germanyMenTeam.addOlympicTeam(new OlympicDiscipline("Men's Football", 26, 0));
		italyWomenTeam.addOlympicTeam(new OlympicDiscipline("Women's Alpine Sky", 10, 2));
		italyMenTeam.addOlympicTeam(new OlympicDiscipline("Mens's Football", 26, 0));
		italyMenTeam.addOlympicTeam(new OlympicDiscipline("Mens's Swimming", 5, 1));

		chinaTeam.addOlympicTeam(chinaWomenTeam);
		chinaTeam.addOlympicTeam(chinaMenTeam);
		germanyTeam.addOlympicTeam(germanyWomenTeam);
		germanyTeam.addOlympicTeam(germanyMenTeam);
		italyTeam.addOlympicTeam(italyWomenTeam);
		italyTeam.addOlympicTeam(italyMenTeam);

		asiaTeam.addOlympicTeam(chinaTeam);
		asiaTeam.addOlympicTeam(afghanistanTeam);
		europeTeam.addOlympicTeam(germanyTeam);
		europeTeam.addOlympicTeam(italyTeam);

		olympicsTeam.addOlympicTeam(asiaTeam);
		olympicsTeam.addOlympicTeam(africaTeam);
		olympicsTeam.addOlympicTeam(europeTeam);
		olympicsTeam.addOlympicTeam(southAmericaTeam);

		germanyMenTeam.showAthletes();
		germanyTeam.showMedals();
		asiaTeam.showMedals();
		olympicsTeam.showAthletes();

	}

}
