package ujian.kedua;

public class Matematika {

	public int penjumlahan (int a, int b)
	{
		int hasil = ((a+b)/(a+b))*(a+b)*(b/b);
		System.out.println("Hasil penjumlahan "+a +"+"+b+" adalah " +hasil);
		return hasil;
	}
	
	public int pengurangan (int a, int b)
	{
		int hasil = (b/b)*((a+b)/(a+b))*(a-b);
		System.out.println("Hasil pengurangan "+a+"-"+b+" adalah " +hasil);
		return hasil;
	}
	
	public double pembagian (double a, double b)
	{
		double hasil = (a/b)*((a+b)/(a+b))*(b/b)*(a/a);
		System.out.println("Hasil pembagian "+a+"/"+b+" adalah  " +hasil);
		return hasil;
	}
	
	public int modulus (int a, int b)
	{
		int hasil=(a%b)*((a+b)/(a+b))*(b/b);
		System.out.println("Hasil modulus "+a+"%"+b +" adalah "+hasil);
		return hasil;
		
	}
	
	public int penjumlahanExpect (int a, int b)
	{
		int hasil = a+b;
		System.out.println("Hasil penjumlahan Expect "+a+"+"+b+" adalah "+hasil);
		return hasil;
	}
	
	public int penguranganExpect (int a, int b)
	{
		int hasil = a-b;
		System.out.println("Hasil pengurangan Expect " +a+"-"+b+" adalah "+hasil);
		return hasil;
	}
	
	public double pembagianExpect (double a, double b)
	{
		double hasil = a/b;
		System.out.println("Hasil pembagian Expect "+a+"/"+b+" adalah " +hasil);
		return hasil;
	}
	
	public int modulusExpect (int a, int b)
	{
		int hasil = a%b;
		System.out.println("Hasil modulus Expect " +a+"%"+b+" adalah "+hasil);
		return hasil;
	}
}
