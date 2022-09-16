package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPathAxis {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		 String baseUrl = "https://demoqa.com/text-box";
		 driver.get(baseUrl);

		 System.out.println(driver.findElement(By.xpath("//input[@id ='userName']//parent::div")).getAttribute("class"));
		 System.out.println(driver.findElement(By.xpath("//input[@id ='first-name']//child::div")).getAttribute("class"));
//		 System.out.println(driver.findElement(By.xpath("//div[@class='col-sm-8 col-sm-offset-2']//child::label[1]")).getAttribute("for")); 
		 //sesuai yg muncul first-name
		 System.out.println(driver.findElement(By.xpath("//div[@class='col-sm-8 col-sm-offset-2']//child::label[1]")).getAttribute("id"));
		 //komponen sesuai, tp ga ada id-->ga muncul apa-apa
		 
		 //cek atasnya langsung -> parent
		 //cek atas -> ancestor
		 //cek bawah -> descendant
		 //cek bawah ->child
		 
		 
		 
		}
}
