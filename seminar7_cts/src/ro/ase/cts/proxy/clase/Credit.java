package ro.ase.cts.proxy.clase;

public class Credit implements CreditAbstract {

	@Override
	public void OferaCredit(TipMoneda tip, float suma) {
		System.out.println("Credit de " + suma + " " + tip);
		
	}

}
