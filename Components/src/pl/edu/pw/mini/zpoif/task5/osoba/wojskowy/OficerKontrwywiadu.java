package pl.edu.pw.mini.zpoif.task5.osoba.wojskowy;

import pl.edu.pw.mini.zpoif.task5.solution.annotation.Funkcjonariusz;
import pl.edu.pw.mini.zpoif.task5.solution.annotation.PoleZastrzezone;

@Funkcjonariusz
public class OficerKontrwywiadu extends Wojskowy {
	@PoleZastrzezone
	protected String nazwaOperacji;

	public OficerKontrwywiadu(String imie, String nazwisko, int wiek, String nazwaOperacji) {
		super(imie, nazwisko, wiek);
		this.nazwaOperacji = nazwaOperacji;
	}

}
