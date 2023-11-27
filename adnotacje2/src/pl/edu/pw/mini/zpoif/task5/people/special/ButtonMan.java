package pl.edu.pw.mini.zpoif.task5.people.special;

import pl.edu.pw.mini.zpoif.task5.people.MafiaWorker;

public class ButtonMan extends MafiaWorker {

	public ButtonMan() {
		super();
	}

	public ButtonMan(String name, String surname) {
		super(name, surname);
	}

	public ButtonMan(String name) {
		super(name);
	}
	public void killHim() {
		System.out.println("Killed!");
	}

	public void killThemAll() {
		System.out.println("Done!");
	}
	
	public void killRetread() {
		System.out.println("Bye!");
	}

}
