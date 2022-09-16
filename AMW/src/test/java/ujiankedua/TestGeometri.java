package ujiankedua;

import org.testng.annotations.Test;

import ujian.kedua.Geometri;

import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestGeometri {
	Geometri g;
	Random rand= new Random();
	int loopAfter=1;
	
	
	@BeforeTest
	public void instance() {
//		System.out.println("Ini Before Test, Test dimulai");
		g= new Geometri();
		
	}
	
	@Test(priority = 0)
	public void TestLuasPersegi()
	{
		System.out.println("");
		System.out.println("============================================");
		System.out.println("ini adalah TEST CASE Luas Persegi");
		//int x=5; //hasil hrs 25
		int x = rand.nextInt(1,101);
		//assertEquals(g.luasPersegi(x),g.luasPersegiExpect(x),"Kedua data tidak cocok");
		assertEquals(g.luasPersegi(x),g.luasPersegiExpect(x),"Kedua data tidak cocok");
	}
	
	@Test(priority = 1)
	public void TestLuasSegitiga()
	{
		System.out.println("");
		System.out.println("============================================");
		System.out.println("ini adalah TEST CASE Luas Segitiga");
//		double x=5; //hasil hrs 12,5
//		double y=5;
		double x = rand.nextInt(1,101);
		double y = rand.nextInt(1,101);
		assertEquals(g.luasSegitiga(x, y),g.luasSegitigaExpect(x, y),"Kedua data tidak cocok");
	}
	
	@Test(priority = 2)
	public void TestLuasTrapesium()
	{
		System.out.println("");
		System.out.println("============================================");
		System.out.println("ini adalah TEST CASE Luas Trapesium");
//		int x=5; //hasil hrs 25
//		int y=5;
//		int z=5;
		int x = rand.nextInt(1,101);
		int y = rand.nextInt(1,101);
		int z = rand.nextInt(1,101);
		assertEquals(g.luasTrapesium(x, y, z),g.luasTrapesiumExpect(x, y, z),"Kedua data tidak cocok");
		System.out.println("============================================");
	}
	
	@AfterMethod
	public void aftMethod()
	{
//		System.out.println("Ini after method ke- "+loopAfter);
//		loopAfter++;
		
	}
	
	@AfterTest
	public void aftTest()
	{
//		System.out.println("TEST SUDAH SELESAI DILAKUKAN !! ");
	}
	
	
	
	
	

}
