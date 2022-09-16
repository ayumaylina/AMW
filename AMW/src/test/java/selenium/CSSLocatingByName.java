package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class CSSLocatingByName {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		 String baseUrl = "https://demoqa.com/automation-practice-form";
		 driver.get(baseUrl);
		
//		 driver.findElement(By.cssSelector("textarea[class='form-control']")).
//		 sendKeys("Jalan Apa coba gitu tulis aja");
		 
		 driver.findElement(By.cssSelector("textarea.form-control")). //penggunaan . utk class, # utk id
		 sendKeys("Jalan Apa coba gitu tulis aja"); //penggunaan css selector atau byId biasa tergantung webnya dinamis atau ngga, jadi atributnya ga konsisten
	}
}
