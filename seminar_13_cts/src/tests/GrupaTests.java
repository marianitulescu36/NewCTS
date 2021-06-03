package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Grupa;
import clase.Student;

public class GrupaTests {
		//Testare Right
		@Test
		public void testConstructorCorect() {
			Grupa grupa=new Grupa(1083);
			assertEquals(1083, grupa.getNrGrupa());
		}
		
		//Testare Boundary
		@Test
		public void testConstructorLimitaInferioara() {
			Grupa grupa=new Grupa(1000);
			assertEquals(1000, grupa.getNrGrupa());
		}
		
		@Test
		public void testConstructorLimitaSuperioara() {
			Grupa grupa=new Grupa(1100);
			assertEquals(1100, grupa.getNrGrupa());
		}
		
		//Testare ErrorConditions //exceptie specifica JUnit4
		@Test(expected = IllegalArgumentException.class)
		public void testConstructorAruncaExceptieLimitaInferioara() {
			Grupa grupa=new Grupa(988);
		}
		@Test(expected = IllegalArgumentException.class)
		public void testConstructorAruncaExceptieLimitaSuperioara() {
			Grupa grupa=new Grupa(1101);
		}
		
		//Testare Performance (right-biceP) si Time(correcT)
		@Test(timeout=500)
		public void testConstructorPerformanta() {
			Grupa grupa=new Grupa(1084);
		}
		
		//Testare EXISTENCE -> corrEct
		@Test
		public void testConstructorExistentaListaStudenti() {
			Grupa grupa=new Grupa(1090);
			assertNotNull(grupa.getStudenti());
		}
		
		//end testare Constructor
		
		//testare getPromovabilitate
		
		//Right
		@Test
		public void testPromovabilitateCorecta() {
			Grupa grupa=new Grupa(1083);
			//integralisti
			for(int i=0;i<7;i++) {
				Student student=new Student("Ionel");
				student.adaugaNota(7);
				grupa.adaugaStudent(student);
			}
			//restantieri
			for(int i=0;i<3;i++) {
				Student student=new Student("Marcel");
				student.adaugaNota(3);
				grupa.adaugaStudent(student);
			}
			assertEquals(0.7f, grupa.getPromovabilitate(),0.1);
		}
		
		//Boundary
		@Test
		public void testPromovabilitateLowerBoundery() {
			Grupa grupa=new Grupa(1083);
			//integralisti
			for(int i=0;i<7;i++) {
				Student student=new Student("Ionel");
				student.adaugaNota(3);
				grupa.adaugaStudent(student);
			}
			assertEquals(0, grupa.getPromovabilitate(),0.1);
		}
		@Test
		public void testPromovabilitateUpperBoundery() {
			Grupa grupa=new Grupa(1083);
			//integralisti
			for(int i=0;i<7;i++) {
				Student student=new Student("Ionel");
				student.adaugaNota(9);
				grupa.adaugaStudent(student);
			}
			assertEquals(1, grupa.getPromovabilitate(),0.1);
		}
		
		//Inverse relationships - nu avem
		//Cross-check - nu avem
		
		//ErrorConditions
		@Test(expected = IndexOutOfBoundsException.class)
		public void testPromovabilitateErrorCondition() {
			Grupa grupa=new Grupa(1001);
			grupa.getPromovabilitate();
		}
		
		//Performance -> GrupaTestCuFixture
		
		//Conformance- acoperit cu Right
		//Ordering - nu avem
		//Range- limitele....
		
		//Reference -> areRestante
		
		//Existence -> grupa fara studenti
		//Cardinality -> pt 0 am facut, pt n am facut -> urm pt 1
		//Time-> e facut (daca apelez getPromovabilitate inainte de adaugaStud)
	}

