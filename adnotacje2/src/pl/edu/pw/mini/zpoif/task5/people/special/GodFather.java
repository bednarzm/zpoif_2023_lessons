package pl.edu.pw.mini.zpoif.task5.people.special;

import pl.edu.pw.mini.zpoif.task5.people.MafiaWorker;

public class GodFather extends MafiaWorker {

	protected Wallet wallet;

	protected class Wallet {

		private int value;

		public Wallet(int value) {
			this.value = value;
		}

	}

	public GodFather() {
		super();
	}

	public GodFather(String name, String surname) {
		super(name, surname);
	}

	public GodFather(String name) {
		super(name);
	}

}
