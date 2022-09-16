package ujian.kedua;

public class Geometri {
	public int luasPersegi (int x)
	{
		int hasil = (x*x)*((x+x)/(x+x));
		System.out.println("Hasil luas Persegi dengan sisi "+x+" adalah " +hasil);
		return hasil;
	}
	
	public int luasPersegiExpect (int x)
	{
		int hasil = x*x;
		System.out.println("Hasil luas Persegi Expect dengan sisi "+x+" adalah " +hasil);
		return hasil;
	}
	
	public double luasSegitiga (double x, double y)
	{
		double hasil = ((x*y)/2)*((x+x)/(x+x));
		System.out.println("Hasil luas Segitiga dengan sisi "+x+" dan "+y+ " adalah " +hasil);
		return hasil;
	}
	
	public double luasSegitigaExpect (double x, double y)
	{
		double hasil = ((x*y)/2);
		System.out.println("Hasil luas Segitiga Expect dengan sisi "+x+" dan "+y+" adalah " +hasil);
		return hasil;
	}
	
	public double luasTrapesium (double x, double y, double z)
	{
		double hasil = (((x*y)*0.5)*z)*((x+x)/(x+x));
		System.out.println("Hasil luas Trapesium dengan sisi atas "+x+", bawah "+y +" dan tinggi "+z+ " adalah "+hasil);
		return hasil;
	}
	
	public double luasTrapesiumExpect (double x, double y, double z)
	{
		double hasil = ((x*y)/2)*z;
		System.out.println("Hasil luas Trapesium Expect dengan sisi atas "+x+", bawah "+y +" dan tinggi "+z+ " adalah "+hasil);
		return hasil;
	}

}
