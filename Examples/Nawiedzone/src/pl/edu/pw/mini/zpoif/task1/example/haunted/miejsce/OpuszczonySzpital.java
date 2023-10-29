package pl.edu.pw.mini.zpoif.task1.example.haunted.miejsce;

import pl.edu.pw.mini.zpoif.task1.example.haunted.czlowiek.Gosc;

public class OpuszczonySzpital extends Miejsce {

	@Override
	public void nawiedz(Gosc gosc) {

		new Straszydlak() {

			@Override
			protected void nastraszKogos(Gosc gosc) {
				if (Gosc.Stan.NORMALNY.equals(gosc.getStan())) {
					gosc.nastraszMnie(15);
				}
			}
		}.nastraszKogos(gosc);

	}

}
