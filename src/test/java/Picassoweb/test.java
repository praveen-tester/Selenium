package Picassoweb;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test {
	
	@Test
	public void m1() {
		System.setProperty("Webdriver.chrome.driver","//Users//apple//Downloads//chrome-mac-arm64 3.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		
		
		
		
		}

}
