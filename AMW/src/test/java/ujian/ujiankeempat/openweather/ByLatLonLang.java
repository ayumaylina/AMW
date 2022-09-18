package ujian.ujiankeempat.openweather;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import restassured.utils.ExcelReader;


public class ByLatLonLang {
	private ExcelReader excelReader;
	private Object [][] dDriven ;
	private int intColumnNums;
	private int intRowNums;
	private JSONObject req ;
	
	
	@BeforeTest
	public void befTest()
	{
		baseURI = "https://api.openweathermap.org/";
		req = new JSONObject();
		String excelPath = "C:\\Users\\nexsoft\\Documents\\Bootcamp\\ujian keempat\\AMW_Ujian_Keempat.xlsx"; 
		String sheetName = "ByLatLonLang";
		excelReader = new ExcelReader(excelPath, sheetName);
		intRowNums = excelReader.getRowCount();
		intColumnNums = excelReader.getColCount();
	}
	
	@DataProvider(name = "DataProviderFirst")
	public Object[][] dataDrivenGet()
	{
		
		dDriven = new Object[intRowNums][intColumnNums];
		
		Iterator<Row> r = excelReader.getIter();
		int a=0;
		int b =1;
		while(r.hasNext())
		{
			System.out.println("");
			System.out.println("Data Ke-"+b);
			Row rows = r.next();
			for(int j=0;j<intColumnNums;j++)
			{
				
				dDriven[a][j] = excelReader.getCellData(a, j);
				
				if( j==0) {
					System.out.println("Lat : "+dDriven[a][j]);
				} else if (j==1){
					System.out.println("Lon : "+dDriven[a][j]);
				} else {
					System.out.println("Lang : "+dDriven[a][j]);
				}
				
			}
			System.out.println("=========================");
			a++;
			b++;
		}
		
		return dDriven;		
	}
	
	@Test(priority = 0,dataProvider="DataProviderFirst")
	public void testGet(String lat, String lon, String lang) //ada 3 parameter, lat, long dan lang
	{		
		given().
		param("lat", lat).and().
		param("lon", lon).and().
		param("lang", lang).and().
		param("appid", "fc14fa94f877f880d099b0bc4d2232f5").
		when().
		get("/data/2.5/weather").
		then().
		statusCode(200).log().all();
	}
}
