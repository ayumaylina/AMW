package restassured;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class SampleRestAssured {
	JSONObject req;
	@BeforeTest
	public void befTest()
	{
		req = new JSONObject();
		baseURI = "http://localhost:3000";
	}
	
	@Test(priority=0)
		public void testPost() 
	{		
		req.put("first_name","Indah"); //key,value
		req.put("last_name","ABCD");
		req.put("subject_id",2);

		given().
			header("Content-Type","application/json").
			accept(ContentType.JSON).
			contentType(ContentType.JSON).
			body(req.toJSONString()).
		when().
			post("/users").
		then().
			statusCode(200).
			log().
			all();
		//given lampirkan ketika ngehit method 
		//get pake parameter
		//log.all->tampilkan informasi keseluruhan
	}
	
//	@Test(priority=1)
//	public void testGet() //get buat ambil data jangan taro data sensitif (credentials, password, signature)
//	{
//		given().
////		param("first_name","Andhika").
//		get("/users/3").then().statusCode(200).log().all();
//	}
	
//	@Test(priority=0)
//	public void testPost() 
//	{		
//		req.put("last_name","Maylinaa"); //key,value
//
//	given().
//		header("Content-Type","application/json").
//		accept(ContentType.JSON).
//		contentType(ContentType.JSON).
//		body(req.toJSONString()).
//	when().
//		patch("/users/4"). //harus ada alamat id nya
//	then().statusCode(200);
//	}
	
//	@Test(priority=0)
//	public void testPut() 
//	{		
//		req.put("last_name","Maylinaa"); //key,value
//		req.put("subject_id",2);
//		
//	given().
//		header("Content-Type","application/json").
//		accept(ContentType.JSON).
//		contentType(ContentType.JSON).
//		body(req.toJSONString()).
//	when().
//		patch("/users/4"). //harus ada alamat id nya
//	then().statusCode(200);
//	}
	
//	@Test(priority=0)
//	public void testDelete() 
//	{		
//	when().
//		patch("/users/4"). 
//	then().statusCode(200);
//	}
//	
//	@Test(priority=1)
//	public void testGet() //get buat ambil data jangan taro data sensitif (credentials, password, signature)
//	{
//		given().
////		param("first_name","Andhika").
//		when(). //tidak ada when tidak berpengaruh tp wajib digunakan
//		get("/users/3").then().statusCode(200).log().all();
//	}
}
