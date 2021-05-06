package ro.ase.cts.chain.clase;

public class ContCurent extends Cont {

	public ContCurent(float sold) {
		super(sold);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void plateste(float suma) {
		if(super.getSold() > suma) {
			System.out.println("Ai platit din contul curent!");
			super.setSold(super.getSold() - suma);
		} else {
			if(super.getSuccesor() == null) {
				System.out.println("Nu se poate efectua plata!");
			} else {
				super.getSuccesor().plateste(suma);
			}
		}
	}

}
