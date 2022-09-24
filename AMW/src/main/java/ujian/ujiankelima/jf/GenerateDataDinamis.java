package ujian.ujiankelima.jf;

import java.util.Random;

public class GenerateDataDinamis {
static Random rand = new Random();
	
	public static void main(String[] args) {
		int intTotal = rand.nextInt(1, 10); //data random yang akan diulang
		int intAwal = 0;
		int intAkhir = 0;
		
		do {
			intAwal = rand.nextInt(1, 100);
			intAkhir = rand.nextInt(1, 100);
		}while(intAwal>intAkhir);
		
		System.out.println("Generate Data Random Integer");
		intRandom(intTotal, intAwal, intAkhir);
		System.out.println("---------------------------------");
		
		System.out.println("Generate Data Random Double");
		doubRandom(intTotal, intAwal, intAkhir);
	}
	
	
	public static void intRandom(int jumlahData, int indexAwal, int indexAkhir) { //parameter yang ditentukan
		System.out.println("Jumlah Data adalah " + jumlahData);
		for(int i=0; i<jumlahData; i++) {
			int intRand = rand.nextInt(indexAwal, indexAkhir);
			System.out.println("Data ke - " +i+ " adalah " + intRand);
		}
	}
	
	public static void doubRandom(int jumlahData, int indexAwal, int indexAkhir) { //parameter yang ditentukan
		System.out.println("Jumlah Data adalah " + jumlahData);
		for(int i=0; i<jumlahData; i++) {
			double doubRand = rand.nextDouble(indexAwal, indexAkhir);
			System.out.println("Data ke - " +i+ " adalah " + doubRand);
		}
	}
}
