package ujian.kedua;

public class StringDouble {
	
	public boolean doubleAct (String x) {
	boolean isExcept=true;
	try{
		Double hasil=Double.valueOf(x);
	}catch(Exception e)
	{
		isExcept=false;
	}
	//System.out.println("Hasil Double Actual adalah "+hasil);
	System.out.println("Hasil Double Actual adalah "+isExcept);
	return isExcept;
	}
	
	
	public boolean doubleExpect (String x) {
	boolean isExcept=true;
	try{
		Double hasil=Double.parseDouble(x);
	}catch(Exception e)
	{ 
		isExcept=false;
	}
	Double hasil=Double.parseDouble(x);
	System.out.println("Hasil Double Expect adalah "+hasil);
	return isExcept;
	}

}
