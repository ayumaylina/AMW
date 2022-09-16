package Latihan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LatihanDua {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		 String baseUrl = "https://formy-project.herokuapp.com/form";
		 driver.get(baseUrl);
		 WebElement firstName = driver.findElement(By.id("first-name")); //kuncinya di id --> first-name
		 firstName.sendKeys("Sutarno");
		 WebElement lastName = driver.findElement(By.id("last-name")); 
		 lastName.sendKeys("Putra");
		 WebElement job = driver.findElement(By.id("job-title")); 
		 job.sendKeys("Teacher");
		 WebElement rb1 = driver.findElement(By.id("radio-button-1")); 
		 rb1.sendKeys("High School");
//		 WebElement rb2 = driver.findElement(By.id("radio-button-2")); 
//		 rb2.sendKeys("College");
//		 WebElement rb3 = driver.findElement(By.id("radio-button-3")); 
//		 rb3.sendKeys("Grad School");
		 WebElement cb1 = driver.findElement(By.id("checkbox-1")); 
		 cb1.sendKeys("Male");
         
		 Select selectExp = new Select(driver.findElement(By.id("select-menu"))); 
		 selectExp.selectByVisibleText("2-4"); 
		 selectExp.selectByIndex(2);
		 
		 WebElement date = driver.findElement(By.id("datepicker")); 
		 date.sendKeys("09/13/2022");
		 
//		 WebElement buttonSubmit = driver.findElement(By.role("submit")); 
//		 buttonSubmit.click();
		 
		 WebElement button = driver.findElement(By.partialLinkText("Submit"));
		 button.click();
}
}
