package pl.edu.pw.mini.zpoif.task5.osoba;

public abstract class Zawodowiec {

	protected String imie;
	protected String nazwisko;
	protected int wiek;
	public void porozmawiajZ(Zawodowiec zawodowiec) {}

	public Zawodowiec() {
		imie = "Nieznane";
		nazwisko = "Nieznane";
	}

	public Zawodowiec(String imie, String nazwisko, int wiek) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.wiek = wiek;
	};

}
