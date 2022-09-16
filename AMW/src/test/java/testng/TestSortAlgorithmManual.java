package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSortAlgorithmManual {
	SortAlgorithm sA;
	int loopRandom =0;
	int [] intNext = {22,13,10,65,100,8,5,85,8,21,6,50};
	
	
	@BeforeTest
	public void befTest()
	{
		sA = new SortAlgorithm();
		System.out.println("INITIATE - BEFORE TEST");
	}
	
	@BeforeMethod
	public void befMethod()
	{
		System.out.println("BEFORE METHOD");
	}
	
	@Test
	public void testSortASC()
	{
//		===> 10,8,1,3,5,6
//		----> 1,3,5,6,8,10 ---> bubble sort
//		----> 1,3,5,6,8,10 ---> selection sort
		//q.equals(n)
//		passed = berhasil = true
//		failed = gagal    = false
		//4,5,6,8,9,13,20,22,50,65,99 --> AYU
		//4,5,6,8,9,13,20,22,50,65,99 -->
		AssertJUnit.assertEquals(sA.selectionSortASCInt(intNext),sA.bubbleSortASCInt(intNext));
	}
	
	@AfterMethod
	public void aftMethod()
	{
		System.out.println("AFTER METHOD");
	}
	
	@AfterClass
	public void aftClass()
	{
		System.out.println("AFTER CLASS");
	}
}