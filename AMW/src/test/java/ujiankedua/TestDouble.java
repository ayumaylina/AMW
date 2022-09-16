package ujiankedua;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ujian.kedua.StringDouble;


public class TestDouble {

	StringDouble s;
	
	@BeforeTest
	public void befTest() {
		s= new StringDouble();
		System.out.println("ini before Test, test dimulai");
	}
	
	@BeforeMethod
	public void befMethod() {
		System.out.println("ini before Method");
	}
	
	@Test(priority = 0)
	public void testString()
	{
		String x="1";
		assertEquals(s.doubleAct(x),s.doubleExpect(x),"Kedua data tidak cocok");
	}
}
