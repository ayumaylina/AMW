package ujiankedua;

import org.testng.annotations.Test;

import ujian.kedua.Matematika;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestMatematika {

	Matematika m;
	Random rand= new Random();
	int loopAfter=1;
	
	
	@BeforeTest
	public void befTest() {
		m= new Matematika();
//		System.out.println("ini before Test, test dimulai");
	}
	
	@BeforeClass
	public void befClass() {
//		System.out.println("ini before Class");
	}
	
	@BeforeMethod
	public void befMethod() {
//		System.out.println("ini before Method");
	}
	
	@Test(priority = 0)
	public void testPenjumlahan()
	{
		System.out.println("");
		System.out.println("============================================");
		System.out.println("ini adalah TEST CASE PENJUMLAHAN");
//		int a=5; //hasil hrs 15
//		int b=10;
		int a = rand.nextInt(1,101);
		int b = rand.nextInt(1,101);
		assertEquals(m.penjumlahan(a, b),m.penjumlahanExpect(a, b),"Kedua data tidak cocok");
	}
	
	@Test(priority = 1)
	public void testPengurangan()
	{
		System.out.println("");
		System.out.println("============================================");
		System.out.println("ini adalah TEST CASE PENGURANGAN");
//		int a=5; //hasil hrs -5
//		int b=10;
		int a = rand.nextInt(1,101);
		int b = rand.nextInt(1,101);
		assertEquals(m.pengurangan(a, b),m.penguranganExpect(a, b),"Kedua data tidak cocok");
	}
	
	@Test(priority = 2)
	public void testPembagian()
	{
		System.out.println("");
		System.out.println("============================================");
		System.out.println("ini adalah TEST CASE PEMBAGIAN");
//		double a=5; //hasil hrs 0.5
//		double b=10;
		double a = rand.nextInt(1,101);
		double b = rand.nextInt(1,101);
		assertEquals(m.pembagian(a, b),m.pembagianExpect(a, b),"Kedua data tidak cocok");
	}
	
	@Test(priority = 3)
	public void testModulus()
	{
		System.out.println("");
		System.out.println("============================================");
		System.out.println("ini adalah TEST CASE MODULUS");
//		int a=15; //hasil hrs 0
//		int b=3;
		int a = rand.nextInt(1,101);
		int b = rand.nextInt(1,101);
		assertEquals(m.modulus(a, b),m.modulusExpect(a, b),"Kedua data tidak cocok");
	}
	
	@AfterMethod
	public void aftMethod()
	{
		
//		System.out.println("ini adalah after method yang ke - "+loopAfter);
//		loopAfter++;
	}
	
	@AfterTest
	public void aftTest()
	{
//		System.out.println("TEST Matematika SUDAH SELESAI DILAKUKAN!! ");
	}
	

}

