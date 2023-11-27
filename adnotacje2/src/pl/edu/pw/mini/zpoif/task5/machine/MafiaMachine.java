package pl.edu.pw.mini.zpoif.task5.machine;

import java.util.Set;

import pl.edu.pw.mini.zpoif.task5.people.MafiaWorker;
import pl.edu.pw.mini.zpoif.task5.people.special.ButtonMan;

public abstract class MafiaMachine {

	protected abstract Set<MafiaWorker> createImportantMafiaWorkers();
	protected abstract MafiaWorker createPrimaryMafiaWorker();
	protected abstract MafiaWorker createPrioritizedPrimaryMafiaWorker();
	protected abstract void encryptFields(Set<MafiaWorker> workers);
	protected abstract ButtonMan getKiller(String name, String surname);
	protected abstract void init(MafiaWorker mafiaWorker);
	protected abstract void goButtonMan(Set<MafiaWorker> buttonMan);
	protected abstract void retreat(ButtonMan buttonMan);

}
