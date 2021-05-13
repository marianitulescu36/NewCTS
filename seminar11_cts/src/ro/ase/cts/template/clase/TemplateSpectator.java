package ro.ase.cts.template.clase;

public abstract class TemplateSpectator {

	public abstract void seAseazaLaCoada();
	public abstract void prezintaBilet();
	public abstract void seFaceControlulCorporal();
	public abstract void ocupaLocul();
	
	// foarte important sa fie metoda finala!!! altfel nu e template
	public final void intrarePeStadion() {
		seAseazaLaCoada();
		prezintaBilet();
		seFaceControlulCorporal();
		ocupaLocul();
	}
}