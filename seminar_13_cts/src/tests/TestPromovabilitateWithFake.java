package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Grupa;
import clase.IStudent;
import ro.ase.cts.clase.dubluri.StudentFake;
import ro.ase.cts.clase.dubluri.StudentStub;

public class TestPromovabilitateWithFake {

	@Test
	public void testPromovabilitateWithFake() {
		Grupa grupa = new Grupa(1083);
		for(int i=0;i<8;i++) {
			StudentFake student = new StudentFake();
			student.setValoareAreRestante(false);
		}
		assertEquals(1, grupa.getPromovabilitate(), 0.01);
	}

}
