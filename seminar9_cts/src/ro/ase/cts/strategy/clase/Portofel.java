package ro.ase.cts.strategy.clase;

public class Portofel implements Strategy {
private float sumaDisponibila;
	
	public Portofel(float sumaDisp) {
		this.sumaDisponibila=sumaDisp;
	}

	@Override
	public void realizeazaPlata(float suma) {
		if(sumaDisponibila>=suma) {
			System.out.println("Tranzactia a fost efectuata cash pt suma de "+suma);
			sumaDisponibila-=suma;
		}
		else {
			System.out.println("Fonduri insuficiente.");
		}
		
	}
}
