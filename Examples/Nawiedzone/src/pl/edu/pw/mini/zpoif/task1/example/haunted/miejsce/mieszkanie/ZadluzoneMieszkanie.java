package pl.edu.pw.mini.zpoif.task1.example.haunted.miejsce.mieszkanie;

import java.util.Random;

import pl.edu.pw.mini.zpoif.task1.example.haunted.czlowiek.Gosc;
import pl.edu.pw.mini.zpoif.task1.example.haunted.miejsce.Miejsce;

public abstract class ZadluzoneMieszkanie extends Miejsce {

	protected int kwotaZaleglosci;

	protected ZadluzoneMieszkanie(int max) {
		kwotaZaleglosci = new Random().nextInt(max + 1) + 1;
	}

	protected class DuchKomornika extends Straszydlak {

		@Override
		protected void nastraszKogos(Gosc gosc) {
			gosc.nastraszMnie((int) (kwotaZaleglosci / 500.0));
		}

	}

	protected abstract void nawiedzLazienke(Gosc gosc);

	protected abstract void nawiedzPralnie(Gosc gosc);

	protected void nastraszPojedynczaInstancjaDuchaKomornika(Gosc gosc) {
		new DuchKomornika().nastraszKogos(gosc);
	}

}
