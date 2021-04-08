package ro.ase.cts.clase;

public class Masina {
	private String marca;
	private boolean areAsigurare;
	private int pretEuro;
	
	private static Masina masina = null;
	
	private Masina(String marca, boolean areAsigurare, int pretEuro) {
		super();
		this.marca = marca;
		this.areAsigurare = areAsigurare;
		this.pretEuro = pretEuro;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setAreAsigurare(boolean areAsigurare) {
		this.areAsigurare = areAsigurare;
	}
	public void setPretEuro(int pretEuro) {
		this.pretEuro = pretEuro;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Marca: ");
		builder.append(marca);
		if(areAsigurare==true) {
			builder.append(", masina are asigurare, ");
		} else {
			builder.append(", masina nu are asigurare, ");
		}
		builder.append("Pretul in euro: ");
		builder.append(pretEuro);
		return builder.toString();
	}

	public static synchronized Masina getInstance(String marca, boolean areAsigurare, int pret) {
		if(masina==null) {
			masina = new Masina(marca, areAsigurare, pret);
		}
		return masina;
	}
}
