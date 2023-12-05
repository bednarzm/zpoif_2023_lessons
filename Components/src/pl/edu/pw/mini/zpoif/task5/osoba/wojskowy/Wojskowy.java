package pl.edu.pw.mini.zpoif.task5.osoba.wojskowy;

import pl.edu.pw.mini.zpoif.task5.osoba.Zawodowiec;

public abstract class Wojskowy extends Zawodowiec {

	protected int nrSluzbowy;

	public Wojskowy(String imie, String nazwisko, int wiek) {
		super(imie, nazwisko, wiek);
	}
	
}
