package ro.ase.cts.command.program;

import ro.ase.cts.command.clase.ComandaConstituire;
import ro.ase.cts.command.clase.ComandaDepunere;
import ro.ase.cts.command.clase.ComandaRetragere;
import ro.ase.cts.command.clase.ContBancar;
import ro.ase.cts.command.clase.ManagerComenzi;

public class Main {

	public static void main(String[] args) {
		ContBancar cont = new ContBancar("Maria");
		ManagerComenzi manager = new ManagerComenzi();
		manager.invoca(new ComandaConstituire(cont, 100));
		
		manager.invoca(new ComandaDepunere(cont, 36));
		manager.executaComanda();
		
		manager.invoca(new ComandaRetragere(cont, 24));
		manager.executaComanda();
		
		manager.invoca(new ComandaRetragere(cont, 1000));
		manager.executaComanda();
	}

}
