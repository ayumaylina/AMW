package testng;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

public class TestMethodMath {

	FunctionMath fM = new FunctionMath();
	
	@Test
	public void testMathPow() {
		String strPow = "2.0";		
		AssertJUnit.assertEquals(fM.testMathPowActual(strPow),fM.testMathPowExpect(strPow));
	}
	
	//ASCII 
	//WRAPPER
	//boolean isTrue = true;
	//false -> isTrue = false;
}