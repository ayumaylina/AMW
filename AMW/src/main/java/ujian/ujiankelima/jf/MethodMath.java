package ujian.ujiankelima.jf;

import java.util.Scanner;

public class MethodMath {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String strLoop="";
		String strNilai;
		System.out.println("Program Method Math");
		
		do {
			try {
				System.out.print("Masukkan nilai: ");
				strNilai = sc.nextLine();
				Double doNilai = Double.parseDouble(strNilai);
				System.out.println("Nilai setelah parsing: " +doNilai);
				System.out.println("Method Math abs = "+Math.abs(doNilai));
				System.out.println("Method Math ceil = "+Math.ceil(doNilai));
				System.out.println("Method Math exp = "+Math.exp(doNilai));
				System.out.println("Method Math sqrt = "+Math.sqrt(doNilai));
				System.out.println("Method Math round = "+Math.round(doNilai));
				System.out.println("Apakah ingin mengulang program? (y/n): ");
				strLoop = sc.nextLine();
				System.out.println();
			} catch (NumberFormatException e) {
				System.out.println(e);
			}
		}while(strLoop.equalsIgnoreCase("y")); 
		//looping berhenti saat user melakukan input selain y dan akan ngeprint code dibawah (line 35)
		
		System.out.println("Looping program Method Math berhenti");
	}

}
