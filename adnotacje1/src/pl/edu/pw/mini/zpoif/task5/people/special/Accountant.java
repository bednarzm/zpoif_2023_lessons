package pl.edu.pw.mini.zpoif.task5.people.special;

import pl.edu.pw.mini.zpoif.task5.people.MafiaWorker;

public class Accountant extends MafiaWorker {

	protected String secondName;
	protected String school;
	
	public Accountant() {
		super();
	}

	public Accountant(String name, String surname) {
		super(name, surname);
	}

	public Accountant(String name) {
		super(name);
	}

}
