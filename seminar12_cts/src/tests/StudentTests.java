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
	
	@Test
	public void testCalculeazaMedie() {
		Student student = new Student();
		int nota1=5, nota2=9, nota3=10;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		float medie=(nota1+nota2+nota3)/3.0f;
		assertEquals(medie, student.calculeazaMedie(),0.01); //marja de eroare de 0.01
	}
	
	@Test
	public void testCalculeazaMediePentruONota() {
		Student student = new Student();
		int nota1=5;
		student.adaugaNota(nota1);
		assertEquals(nota1, student.calculeazaMedie(),0.01);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testCalculeazaMediePentruZeroNote() {
		Student student = new Student();
		student.calculeazaMedie();
	}
	
	
	@Test
	public void testAreRestante() {
		Student student = new Student();
		int nota1=10, nota2=10, nota3=4;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		assertTrue(student.areRestante());
	}
	
	@Test
	public void testNuAreRestante() {
		Student student = new Student();
		int nota1=10, nota2=10, nota3=10;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		assertFalse(student.areRestante());
	}
	
	
}







































