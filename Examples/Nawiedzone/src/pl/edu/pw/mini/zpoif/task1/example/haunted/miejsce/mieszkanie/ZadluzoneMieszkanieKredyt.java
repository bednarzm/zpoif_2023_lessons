package pl.edu.pw.mini.zpoif.task1.example.haunted.miejsce.mieszkanie;

import pl.edu.pw.mini.zpoif.task1.example.haunted.czlowiek.Gosc;

public class ZadluzoneMieszkanieKredyt extends ZadluzoneMieszkanie {

	public ZadluzoneMieszkanieKredyt() {
		super(10000);
	}

	@Override
	public void nawiedz(Gosc gosc) {
		nawiedzLazienke(gosc);
		nawiedzPralnie(gosc);
	}

	@Override
	protected void nawiedzLazienke(Gosc gosc) {
		DuchKomornika duchKomornika1 = new DuchKomornika();
		DuchKomornika duchKomornika2 = new DuchKomornika();

		duchKomornika1.nastraszKogos(gosc);
		duchKomornika2.nastraszKogos(gosc);

	}

	@Override
	protected void nawiedzPralnie(Gosc gosc) {
		nastraszPojedynczaInstancjaDuchaKomornika(gosc);
	}

}
