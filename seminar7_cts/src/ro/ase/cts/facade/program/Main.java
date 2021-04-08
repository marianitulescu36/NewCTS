package ro.ase.cts.facade.program;

import ro.ase.cts.facade.clase.Facade;
import ro.ase.cts.facade.clase.Persoana;

public class Main {

	public static void main(String[] args) {

		Persoana persoana = new Persoana("2991128340000", "Maria");
		
		if(Facade.esteEligibil(persoana)) {
			System.out.println("Oferim creditul.");
		} else {
			System.out.println("Nu oferim creditul.");
		}

	}

}
