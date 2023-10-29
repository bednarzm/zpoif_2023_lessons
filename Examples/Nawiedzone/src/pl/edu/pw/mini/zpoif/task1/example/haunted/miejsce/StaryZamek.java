package pl.edu.pw.mini.zpoif.task1.example.haunted.miejsce;

import pl.edu.pw.mini.zpoif.task1.example.haunted.czlowiek.Gosc;

public class StaryZamek extends Miejsce {

	private static final int MOC_BIALYCH_DAM = 20;

	public static class BialaDama extends Straszydlak {

		@Override
		protected void nastraszKogos(Gosc gosc) {
			gosc.nastraszMnie(MOC_BIALYCH_DAM);
		}

	}

	@Override
	public void nawiedz(Gosc gosc) {
		new BialaDama().nastraszKogos(gosc);

		class DuchWlascicielaZamku extends Straszydlak {

			@Override
			protected void nastraszKogos(Gosc gosc) {
				gosc.nastraszMnie(0);
			}

		}

		DuchWlascicielaZamku duchWlascicielaZamku1 = new DuchWlascicielaZamku();
		DuchWlascicielaZamku duchWlascicielaZamku2 = new DuchWlascicielaZamku();

		duchWlascicielaZamku1.nastraszKogos(gosc);
		duchWlascicielaZamku2.nastraszKogos(gosc);

	}

}
