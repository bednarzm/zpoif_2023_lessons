package pl.edu.pw.mini.zpoif.task5.osoba.cywil;

import pl.edu.pw.mini.zpoif.task5.osoba.Zawodowiec;
import pl.edu.pw.mini.zpoif.task5.solution.annotation.PodkreslZnaczenie;

public abstract class Cywil extends Zawodowiec {

	@PodkreslZnaczenie
	protected String opisDzialalnosci;

	public Cywil(String imie, String nazwisko, int wiek) {
		super(imie, nazwisko, wiek);
	}

}
