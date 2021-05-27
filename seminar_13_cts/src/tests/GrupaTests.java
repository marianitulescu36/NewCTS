package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Grupa;

public class GrupaTests {

	@Test
	public void testConstructorCorect() {
		Grupa grupa = new Grupa(1083);
		assertEquals(1083, grupa.getNrGrupa());
	}
	
	@Test
	public void testConstructorLimitaInferioara() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	
	@Test
	public void testConstructorLimitaSuperioara() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1100, grupa.getNrGrupa());
	}

}
