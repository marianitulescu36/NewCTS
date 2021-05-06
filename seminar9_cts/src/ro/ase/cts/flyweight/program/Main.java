package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.clase.FlyweightFactory;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Main {

	public static void main(String[] args) {
		Rezervare r1 = new Rezervare(1, 1, 1);
		Rezervare r2 = new Rezervare(2, 2, 2);
		Rezervare r3 = new Rezervare(3, 3, 3);
		
		FlyweightFactory factory = new FlyweightFactory();
		
		factory.getClient("1234").printeazaRezervare(r1);
		factory.getClient("4321").printeazaRezervare(r2);
		
		factory.getClient("1234").printeazaRezervare(r3);

	}

}
