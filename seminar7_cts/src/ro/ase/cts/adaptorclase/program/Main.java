package ro.ase.cts.adaptorclase.program;

import ro.ase.cts.adaptorclase.clase.AdaptorCreditClase;
import ro.ase.cts.adaptorclase.clase.CreditAbstract;

public class Main {
	
	public static void afiseazaInfoCredit(CreditAbstract credit) {
		credit.oferaCredit();
	}

	public static void main(String[] args) {
		
		AdaptorCreditClase adaptorClase = new AdaptorCreditClase(36, "Maria");
		afiseazaInfoCredit(adaptorClase);

	}

}