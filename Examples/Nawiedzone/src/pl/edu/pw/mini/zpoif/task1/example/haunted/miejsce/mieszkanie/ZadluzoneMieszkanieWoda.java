package pl.edu.pw.mini.zpoif.task1.example.haunted.miejsce.mieszkanie;

import java.util.Random;

import pl.edu.pw.mini.zpoif.task1.example.haunted.czlowiek.Gosc;

public class ZadluzoneMieszkanieWoda extends ZadluzoneMieszkanie {

	public ZadluzoneMieszkanieWoda() {
		super(1000);
	}

	private static class DuchPlywaka extends Straszydlak {

		@Override
		protected void nastraszKogos(Gosc gosc) {
			gosc.nastraszMnie(10 + new Random().nextInt(21));
		}

	}

	@Override
	public void nawiedz(Gosc gosc) {
		if (new Random().nextBoolean()) {
			nawiedzLazienke(gosc);
		} else {
			nawiedzPralnie(gosc);
		}
	}

	@Override
	protected void nawiedzLazienke(Gosc gosc) {

		DuchPlywaka duchPlywaka1 = new DuchPlywaka();
		DuchPlywaka duchPlywaka2 = new DuchPlywaka();

		duchPlywaka1.nastraszKogos(gosc);
		duchPlywaka2.nastraszKogos(gosc);
	}

	@Override
	protected void nawiedzPralnie(Gosc gosc) {
		nastraszPojedynczaInstancjaDuchaKomornika(gosc);
	}

}
