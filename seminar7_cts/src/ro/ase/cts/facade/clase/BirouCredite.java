package ro.ase.cts.facade.clase;

public class BirouCredite {
	public static boolean areCredite(Persoana persoana) {
		if(Integer.parseInt(""+persoana.getCNP().charAt(12)) % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}
}
