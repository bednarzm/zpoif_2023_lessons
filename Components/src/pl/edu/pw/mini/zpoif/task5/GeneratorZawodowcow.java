package pl.edu.pw.mini.zpoif.task5;

import java.util.List;

import pl.edu.pw.mini.zpoif.task5.osoba.Zawodowiec;
import pl.edu.pw.mini.zpoif.task5.osoba.cywil.Cywil;
import pl.edu.pw.mini.zpoif.task5.osoba.cywil.Kierowca;
import pl.edu.pw.mini.zpoif.task5.osoba.cywil.Lekarz;
import pl.edu.pw.mini.zpoif.task5.osoba.cywil.Nauczyciel;
import pl.edu.pw.mini.zpoif.task5.osoba.wojskowy.OficerKontrwywiadu;
import pl.edu.pw.mini.zpoif.task5.osoba.wojskowy.Szpieg;
import pl.edu.pw.mini.zpoif.task5.osoba.wojskowy.Wojskowy;
import pl.edu.pw.mini.zpoif.task5.osoba.wojskowy.Zolnierz;

public class GeneratorZawodowcow {

	public static List<Class<?>> generujZnaneKlasy() {
		return List.of(Zawodowiec.class, Cywil.class, Kierowca.class, Lekarz.class, Nauczyciel.class, OficerKontrwywiadu.class, Szpieg.class, Wojskowy.class, Zolnierz.class);
	}
	
	public static List<Zawodowiec> generujZawodowcow(){
		return List.of(new Kierowca("Jan", "Serce", 20, "Zawsze trzezwo myslacy"), new Kierowca("Witek", "Nowak", 30, "brak wad"), new Kierowca("Michal", "Kichal", 35, "Ladnie skreca"), new Kierowca("Anna", "Wanna", 21, "Szybki"),
				new Lekarz("Jaroslaw", "Stec", 31, "Zero zgonow w tym tygodniu"), new Lekarz("Jacek", "Mizial", 29, "Nieprzekupny"), new Lekarz("Joanna", "Joanna", 61, "Brak!"), new Lekarz("Stanislaw", "Koziol", 45, "Nie lubi antybiotykow"), 
				new Nauczyciel("Jacek", "Placek", 42, "Wychowal 10-ciu olimpijczykow"), new Nauczyciel("Ireneusz", "Chronimski", 43, "Zostal dyrektorem"), new Nauczyciel("Sylwester", "Jasinski", 53, "Wychowal duzo olimpijczykow"), new Nauczyciel("Anna", "Malinowska", 51, "Nikt jej nie podskoczyl"),
				new Zolnierz("Piotr", "Moskal", 33), new Zolnierz("Rafal", "Pieczynski", 22), new Zolnierz("Aniela", "Daniela", 19), new Zolnierz("Zdzislaw", "Pluton", 71), 
				new Szpieg("Pawel", "Gawel", 42, "Arbuz"), new Szpieg("Henryk", "Wielki", 41, "Maly"), new Szpieg("Alicja", "Wrobel", 40, "Lilia"), new Szpieg("Jacek", "Hiszpanski", 35, "Bond"),
				new OficerKontrwywiadu("Jan", "Nowak", 33, "Piknik"), new OficerKontrwywiadu("Olgierd", "Kryska", 20, "zpoif"), new OficerKontrwywiadu("Stefan", "Popiel", 47, "Madagaskar"), new OficerKontrwywiadu("Jan", "Pan", 60, "Wierzba"));
	}

}
