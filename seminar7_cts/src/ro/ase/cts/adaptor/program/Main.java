package ro.ase.cts.adaptor.program;

import ro.ase.cts.adaptor.clase.AdaptorCreditObiecte;
import ro.ase.cts.adaptor.clase.CreditAbstract;
import ro.ase.cts.adaptor.clase.Leasing;

public class Main {
	
	public static void afiseazaInfoCredit(CreditAbstract credit, float suma) {
		credit.oferaCredit(suma);
	}

	public static void main(String[] args) {
		Leasing leasing = new Leasing(100, "Maria");
		AdaptorCreditObiecte adaptor = new AdaptorCreditObiecte(leasing);
		afiseazaInfoCredit(adaptor, leasing.getSuma());

	}

}
