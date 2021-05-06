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
				
				Strategy cardStrategy=new Card();
				Strategy cashStrategy=new Portofel(200);
				Client client=new Client("Marin",cashStrategy);
				
				client.platesteNota(200);
				client.platesteNota(200);
				client.setStrategy(cardStrategy);
				client.platesteNota(200);
				
				Strategy bonuriStrategy=new BonuriMasa();
				client.setStrategy(bonuriStrategy);
				client.platesteNota(150);

	}

}
