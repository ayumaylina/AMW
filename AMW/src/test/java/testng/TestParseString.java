package testng;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestParseString {

	SortAlgorithm sA = new SortAlgorithm();
	
	@Test
	public void testParseOne()
	{
		String inputData = "13.0";
		AssertJUnit.assertEquals(sA.testParseToIntActual(inputData), sA.testParseToIntExpect(inputData));
//		assertEquals(sA.testParseToIntActual(inputData), true);
	}
}
