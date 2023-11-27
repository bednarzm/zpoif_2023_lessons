package pl.edu.pw.mini.zpoif.task5.people;

public abstract class MafiaWorker {

	protected String name;

	protected String surname;

	protected class Pocket {

		private int value;

		public Pocket(int value) {
			this.value = value;
		}

	}

	protected MafiaWorker() {
		this.name = "no_name";
		this.surname = "no_surname";
	}

	protected MafiaWorker(String name) {
		this.name = name;
		this.surname = "no_surname";
	}

	protected MafiaWorker(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

}
