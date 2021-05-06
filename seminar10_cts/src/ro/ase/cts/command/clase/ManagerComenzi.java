package ro.ase.cts.command.clase;

import java.util.List;

public class ManagerComenzi {
	private List<Comanda> comenzi;

	public ManagerComenzi() {
		super();
	}
	
	public void invoca(Comanda comanda) {
		comenzi.add(comanda);
	}
	
	public void executaComanda() {
		if(comenzi.isEmpty()) {
			comenzi.get(0).executa();
			comenzi.remove(0);
		}
	}
}
