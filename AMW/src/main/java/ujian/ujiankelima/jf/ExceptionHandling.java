package ujian.ujiankelima.jf;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionHandling {
	public static void main(String[] args) throws IOException {
		FileInputStream inputFile = null;
		
		try {
			inputFile = new FileInputStream("C:\\Users\\nexsoft\\Documents\\Bootcamp\\ujiankelima.txt");
			inputFile.close();
		}catch(Exception e)
		{
			System.out.println("FILE TIDAK DITEMUKAN !!"+e);
		}    
    }
}
