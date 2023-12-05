package pl.edu.pw.mini.zpoif.task5.osoba.wojskowy;

import pl.edu.pw.mini.zpoif.task5.solution.annotation.Funkcjonariusz;
import pl.edu.pw.mini.zpoif.task5.solution.annotation.WywolajNRazy;
import pl.edu.pw.mini.zpoif.task5.solution.annotation.WywolanieRejestrowane;

@Funkcjonariusz
public class Zolnierz extends Wojskowy {

	public Zolnierz(String imie, String nazwisko, int wiek) {
		super(imie, nazwisko, wiek);
	}

	@WywolajNRazy(min = 4, max = 6)
	@WywolanieRejestrowane
	private void strzelajPojedynczo() {
		System.out.println("Pach, pach...");
	}

	@WywolajNRazy(min = 4, max = 6)
	@WywolanieRejestrowane
	private void strzelajSeria() {
		System.out.println("Tratatatata...");
	}

	@WywolajNRazy(min = 4, max = 6)
	private void pospiewajDoMarszu() {
		System.out.println("Raz, dwa lewa, raz dwa lewa... ");
	}

	private void zlozMeldunek() {
		System.out.println("Melduje poslusznie ze ... ");
	}

}
