package pl.edu.pw.mini.zpoif.task1.example.haunted.czlowiek;

public class Turysta extends Gosc {
	public void nastraszMnie(int moc) {
		if (moc > odpornosc) {
			switch (stan) {
				case NORMALNY:
					stan = Stan.PRZERAZONY;
					break;
				case PRZERAZONY:
					stan = Stan.PANIKA;
					break;
				}
		} else if (moc < odpornosc) {
			switch (stan) {
				case PANIKA:
					stan = Stan.PRZERAZONY;
					break;
				case PRZERAZONY:
					stan = Stan.NORMALNY;
					break;
			}
		}
		System.out.println(this);
	}
}
