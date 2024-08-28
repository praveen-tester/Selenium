package Picassoweb;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class TopNavigation {
	WebDriver driver;	
	int cout=0;
	
	@Test
	public void topnav() {
		System.setProperty("WebDriver.chrome.driver","//Users//apple//Downloads//chrome-mac-arm64 3.exe");
	    driver=new ChromeDriver();
		driver.get("https://test.sustenos.com/");
		driver.manage().window().maximize();
		List<WebElement> l1=driver.findElements(By.xpath("//ul[@class='header-navbar']//li"));
		int count=l1.size();
		for(WebElement li:l1) {
			System.out.println(li.getText());
			
		}
		
	}
	@AfterClass
	public void closebrowser() {
		driver.quit();
	}
	
	

}
