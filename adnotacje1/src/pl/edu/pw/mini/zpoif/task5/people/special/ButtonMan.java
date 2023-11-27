package pl.edu.pw.mini.zpoif.task5.people.special;

import pl.edu.pw.mini.zpoif.task5.people.MafiaWorker;

public class ButtonMan extends MafiaWorker {

	protected String firstVictim = "John D.";
	protected String secondVictim = "Matt Cooper";
	protected String thirdVictim = "Unknown";

	public ButtonMan() {
		super();
	}

	public ButtonMan(String name, String surname) {
		super(name, surname);
	}

	public ButtonMan(String name) {
		super(name);
	}

	public void killHim(String value) {
		System.out.println(value + " has been killed!");
	}

	public void killThemAll(String value) {
		System.out.println(value + " also killed");
	}

}
