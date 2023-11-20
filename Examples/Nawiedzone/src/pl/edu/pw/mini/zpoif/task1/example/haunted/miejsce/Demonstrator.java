package pl.edu.pw.mini.zpoif.task1.example.haunted.miejsce;

import java.util.List;

import pl.edu.pw.mini.zpoif.task1.example.haunted.czlowiek.Student;
import pl.edu.pw.mini.zpoif.task1.example.haunted.czlowiek.Turysta;
import pl.edu.pw.mini.zpoif.task1.example.haunted.miejsce.mieszkanie.ZadluzoneMieszkanieKredyt;
import pl.edu.pw.mini.zpoif.task1.example.haunted.miejsce.mieszkanie.ZadluzoneMieszkanieWoda;

public class Demonstrator {

	public static void main(String[] args) {

		List<Student> studenci = List.of(new Student(), new Student(), new Student(), new Student(), new Student());
		List<Turysta> turysci = List.of(new Turysta(), new Turysta(), new Turysta(), new Turysta(), new Turysta());

		StaryZamek staryZamek = new StaryZamek();
		OpuszczonySzpital opuszczonySzpital = new OpuszczonySzpital();
		ZadluzoneMieszkanieKredyt zadluzoneMieszkanieKredyt = new ZadluzoneMieszkanieKredyt();
		ZadluzoneMieszkanieWoda zadluzoneMieszkanieWoda = new ZadluzoneMieszkanieWoda();

		for (Student student : studenci) {
			staryZamek.nawiedz(student);
			opuszczonySzpital.nawiedz(student);
			zadluzoneMieszkanieWoda.nawiedz(student);
			zadluzoneMieszkanieKredyt.nawiedz(student);
		}

		for (Turysta turysta : turysci) {
			staryZamek.nawiedz(turysta);
			opuszczonySzpital.nawiedz(turysta);
			zadluzoneMieszkanieWoda.nawiedz(turysta);
			zadluzoneMieszkanieKredyt.nawiedz(turysta);
		}

	}

}
