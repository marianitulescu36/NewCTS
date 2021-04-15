package ro.ase.cts.decorator.clase;

public class DecoratorNotaPasteFericit extends DecoratorAbstract {

	public DecoratorNotaPasteFericit(NotaAbstracta nota) {
		super(nota);
		
	}

	@Override
	public void printeazaFelicitare() {
		System.out.println("Felicitare - Paste fericit!");
		
	}
	
	public void printeaza() {
		super.printeaza();
		System.out.println("Paste fericit!");
	}
	
}
