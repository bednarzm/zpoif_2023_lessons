package pl.edu.pw.mini.zpoif.task5.osoba.cywil;

import pl.edu.pw.mini.zpoif.task5.solution.annotation.PodkreslZnaczenie;

public class Lekarz extends Cywil {
	@PodkreslZnaczenie
	protected String opisSukcesow;

	public Lekarz(String imie, String nazwisko, int wiek, String opisSukcesow) {
		super(imie, nazwisko, wiek);
		this.opisSukcesow = opisSukcesow;
	}

}
