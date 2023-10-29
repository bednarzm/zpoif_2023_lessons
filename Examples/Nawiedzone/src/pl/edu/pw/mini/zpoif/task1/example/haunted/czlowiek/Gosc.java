package pl.edu.pw.mini.zpoif.task1.example.haunted.czlowiek;

import java.util.Random;

public abstract class Gosc {

	protected int odpornosc = 10 + new Random().nextInt(11);
	protected Stan stan = Stan.NORMALNY;

	public enum Stan {
		NORMALNY, PRZERAZONY, PANIKA
	}

	public abstract void nastraszMnie(int moc);

	public Stan getStan() {
		return stan;
	}

	@Override
	public String toString() {
		return "Stan=" + stan;
	}

}
