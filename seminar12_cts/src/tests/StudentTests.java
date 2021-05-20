package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Student;

public class StudentTests {

	@Test
	public void testConstructorCuParametri() {
		String nume="Maria";
		Student student = new Student(nume);
		
//		if(nume != student.getNume()) {
//			fail("Numele nu este acelasi");
//		}
		
		assertEquals("Numele nu a fost initializat", nume, student.getNume());
		assertNotNull("Lista nu a fost initializata", student.getNote());
	}
	
	@Test
	public void testSetterNume() {
		String nume="Maria";
		Student student = new Student();
		student.setNume(nume);

		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testConstructorFaraParametri() {
		Student student = new Student();

		assertNotNull("Numele nu a fost initializat", student.getNume());
		assertNotNull("Lista nu a fost initializata", student.getNote());
	}
	
	@Test
	public void testAdaugaNota() {
		Student student = new Student();
		int nota = 8;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}

	@Test
	public void testDimensiuneLista() {
		Student student = new Student();
		int nota = 8;
		student.adaugaNota(nota);
		assertEquals(1, student.getNote().size());
	}
	
	
}







































