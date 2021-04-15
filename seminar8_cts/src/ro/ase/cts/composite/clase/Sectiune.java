package ro.ase.cts.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements ComponentaMeniu{
	private List<ComponentaMeniu> listaComponente;
	private String numeSectiune;
	
	public Sectiune(String numeSectiune) {
		super();
		this.listaComponente = new ArrayList<ComponentaMeniu>();
		this.numeSectiune = numeSectiune;
	}

	@Override
	public void adaugaNod(ComponentaMeniu componenta) {
		listaComponente.add(componenta);
		
	}

	@Override
	public void stergeNod(ComponentaMeniu componenta) {
		listaComponente.remove(componenta);
		
	}

	@Override
	public ComponentaMeniu getNod(int index) {
		if(index<listaComponente.size() && index>=0) {
			return listaComponente.get(index);
		}
		return null;
	}

	@Override
	public void printeaza() {
		System.out.println("Sectiunea " + numeSectiune);
		for(ComponentaMeniu componenta:listaComponente) {
			componenta.printeaza();
		}
		
	}
	
}