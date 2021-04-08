package program;

import classes.Giraffe;
import classes.Zebra;
import classes.Zoo;
import classes.Zookeeper;

public class Main {

	public static void main(String[] args) {
		Zoo z = new Zoo();
		Giraffe giraffe = new Giraffe("Girafa1");
		Giraffe giraffe2 = new Giraffe("Girafa2");
		
		z.addAnimal(giraffe);
		z.addAnimal(giraffe2);
		
		z.feedAllAnimals();
		
		Zebra z1 = new Zebra("z1");
		Zebra z2 = new Zebra("z2");
		
		z.addAnimal(z1);
		z.addAnimal(z2);
		
		z.feedAllAnimals(); 
	}

}
