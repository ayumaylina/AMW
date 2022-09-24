package ujian.ujiankelima.testng;

import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import generatedata.GenerateData;
import ujian.kedua.StringDouble;

public class TestStringToDouble {
	StringDouble s;
	//String s;
	Random rand= new Random();
	GenerateData g = new GenerateData();
	
	@BeforeTest
	public void befTest() {
		//s= new StringDouble();
		s= new StringDouble();
//		System.out.println("ini before Test, test dimulai");
	}
	
	@BeforeMethod
	public void befMethod() {
//		System.out.println("ini before Method");
	}
	
	@Test(priority = 0)
	public void testString()
	{
		System.out.println("");
		System.out.println("=============================");
		//String x="1";
		String x = g.randomString();
		assertEquals(s.doubleAct(x), s.doubleExpect(x),"Kedua data tidak cocok" );
	}


}
