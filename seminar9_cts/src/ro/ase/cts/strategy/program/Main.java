package ro.ase.cts.strategy.program;

import ro.ase.cts.strategy.clase.BonuriMasa;
import ro.ase.cts.strategy.clase.Card;
import ro.ase.cts.strategy.clase.Client;
import ro.ase.cts.strategy.clase.Portofel;
import ro.ase.cts.strategy.clase.Strategy;

public class Main {

	public static void main(String[] args) {
		// strategy- cand avem mai multe moduri de a utiliza o problema
		// selectam la runtime in ce mod rezolvam problema
				
		Strategy card=new Card();
		Strategy cash=new Portofel(200);
		Client client=new Client("Maria",cash);
				
		client.platesteNota(200);
		client.platesteNota(200);
		client.setStrategy(card);
		client.platesteNota(200);
				
		Strategy bonuri=new BonuriMasa();
		client.setStrategy(bonuri);
		client.platesteNota(150);

	}

}
