package ro.ase.cts.program;

import ro.ase.cts.clase.BrokerTranzactie;
import ro.ase.cts.clase.BrokerTranzactieLazy;
import ro.ase.cts.clase.Masina;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BrokerTranzactie broker1 = BrokerTranzactie.getInstance();
//		BrokerTranzactie broker2 = BrokerTranzactie.getInstance();
//		System.out.println(broker1.toString());
//		System.out.println(broker2.toString());
//		
//		broker1.setName("Alina");
//		broker2.setNrTranzactiiEfectuate(9);
//		
//		System.out.println(broker1.toString());
//		System.out.println(broker2.toString());
//		
//		BrokerTranzactieLazy lazy1 = BrokerTranzactieLazy.getInstance("Ana", 2, 30);
//		BrokerTranzactieLazy lazy2 = BrokerTranzactieLazy.getInstance("Bianca", 4, 50);
//		System.out.println(lazy1.toString());
//		System.out.println(lazy2.toString());
		
		Masina masina1 = Masina.getInstance("Dacia", true, 3500);
		Masina masina2 = Masina.getInstance("BMW", false, 6000);
		System.out.println(masina1.toString());
		System.out.println(masina2.toString());
	}

}
