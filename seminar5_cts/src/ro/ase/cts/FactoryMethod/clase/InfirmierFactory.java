package ro.ase.cts.FactoryMethod.clase;

public class InfirmierFactory implements FactoryPersonal{

	@Override
	public PersonalSpital getPersonal(String nume) {
		// TODO Auto-generated method stub
		return new Infirmier(nume);
	}

}
