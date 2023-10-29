package pl.edu.pw.mini.zpoif.task1.example.haunted.miejsce;

import pl.edu.pw.mini.zpoif.task1.example.haunted.czlowiek.Gosc;

public abstract class Miejsce {

	public abstract void nawiedz(Gosc gosc);

	protected static abstract class Straszydlak {
		protected abstract void nastraszKogos(Gosc gosc);
	}

}
