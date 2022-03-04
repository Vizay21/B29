package p29;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {

	@Test
	public void testA() {
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.chromedriver().browserVersion("").setup();
		//WebDriver driver=new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.quit();
		System.out.println("end");
		
		
	}
}
