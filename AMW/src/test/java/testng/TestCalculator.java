package testng;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCalculator {
	Calculator c;
	Random rand ;
//	@BeforeSuite
//	public void testSuiteOnleh()
//	{
//		System.out.println("TEST SUITE BEFORE SUITE TEST CALCULATOR");
//	}
	@BeforeTest
	public void generateData() {
		rand = new Random();
	}
	@Test
	public void testAddNilai() {
		System.out.println("===============================TEST ADD NILAI DIMULAI =========================================");
		int x =rand.nextInt(1,101);
		int y =rand.nextInt(1,103);
		
		AssertJUnit.assertEquals(c.addNilai(x, y),c.addNilaiX(x, y));
		System.out.println("===============================TEST ADD NILAI SELESAI =========================================");
//		AssertJUnit.assertEquals(c.addNilaiManda(x, y),22);
	}
	
//	@Test
//	public void testDivideNilai() {
////		Calculator c = new Calculator();
//		assertEquals(c.divideNilai(10,3),3.333);
//	}	
	
	@BeforeMethod
	public void instance()
	{
		System.out.println("OK MASUK KESINI");
		c = new Calculator();
	}
//	@AfterSuite
//	public void testSuiteOnlehh()
//	{
//		System.out.println("TEST SUITE AFTER SUITE TEST CALCULATOR");
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	Calculator x;
	
//	@BeforeClass
//	public void testSemua()
//	{
//		x = new Calculator();
//	}
//	
//	@Test
//	public void testAddNilai()
//	{
////		Calculator c = new Calculator();
//		assertEquals(x.addNilai(3, 2), 5);
////		assT
//	}
	
	
	
}