package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import ujian.kedua.SortAlgorithm;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSortAlgorithm {

	Random rand ;
	SortAlgorithm sA;
	int loopRandom =0;
	int [] intNext ;
	
	@BeforeTest
	public void befTest()
	{		
		sA = new SortAlgorithm();
		rand = new Random();
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
		loopRandom = rand.nextInt(5,11);
		intNext = new int[loopRandom];
		
		for(int i=0;i<loopRandom;i++)
		{
			intNext[i]=rand.nextInt(10,101);
		}
		AssertJUnit.assertEquals(sA.selectionSortASCInt(intNext), sA.bubbleSortASCInt(intNext));
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