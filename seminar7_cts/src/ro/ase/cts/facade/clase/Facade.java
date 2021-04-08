package ro.ase.cts.facade.clase;

public class Facade {
	public static boolean esteEligibil(Persoana persoana) {
		if(persoana.getVarsta()>=18) {
			Politie politie = new Politie();
			if(politie.esteUrmarit(persoana)==false) {
				if(BirouCredite.areCredite(persoana)==false) {
					return true;
				}  else { 
					return false;
				}
			}
		}
		return false;
	}
}
