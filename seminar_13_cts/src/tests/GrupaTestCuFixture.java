package tests;

import org.junit.Before;
import org.junit.Test;

import clase.Grupa;
import clase.Student;

public class GrupaTestCuFixture {

	private Grupa grupa;

	// JUnit4-> Before, 3->Setup
	@Before
	public void setup() {
		grupa = new Grupa(1038);
		for (int i = 0; i < 35; i++) {
			Student student = new Student("Ionel");
			for (int j = 0; j < 7; j++) {
				student.adaugaNota(8);
			}
			grupa.adaugaStudent(student);
		}
	}

	// Performance
	@Test(timeout = 500)
	public void testPromovabilitatePerformance() {
		grupa.getPromovabilitate();
	}
}