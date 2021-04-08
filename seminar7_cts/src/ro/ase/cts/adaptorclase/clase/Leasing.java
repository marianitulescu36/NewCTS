package ro.ase.cts.adaptorclase.clase;

public class Leasing {
	
	private float suma;
	private String numeClientString;
	
	public Leasing(float suma, String numeClientString) {
		super();
		this.suma = suma;
		this.numeClientString = numeClientString;
	}
	
	public float getSuma() {
		return suma;
	}
	
	public String getNumeClientString() {
		return numeClientString;
	}
	
	public void imprumuta() {
		System.out.println(numeClientString + " a realizat un leasing de " + suma + " lei.");
	}
}
