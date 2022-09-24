package generatedata;

import java.util.Random;

public class GenerateData {
	public String randomString () 
	{
		int leftLimit = 48; // numeral '0'
		//int rightLimit = 57; // numeral '9' //--> buat string utk langsung numeric aja
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 10;
	    Random random = new Random();
	    
	    String generatedString = random.ints(leftLimit, rightLimit + 1)
	    	     .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
	    		//.filter(i -> (i <= 57 )) //--> buat string utk langsung numeric aja
	    	      .limit(targetStringLength)
	    	      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
	    	      .toString();

	    	    System.out.println(generatedString);
		return generatedString;
	}

}
