package pl.edu.pw.mini.zpoif.task5.osoba.cywil;

public class Kierowca extends Cywil {

	protected String opisZalet;

	public Kierowca(String imie, String nazwisko, int wiek, String opisZalet) {
		super(imie, nazwisko, wiek);
		this.opisZalet = opisZalet;
	}

}
