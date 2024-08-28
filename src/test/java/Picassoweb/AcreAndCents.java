package Picassoweb;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AcreAndCents {
	
	
	@Test
	public void acrecents() {
		System.setProperty("Webdriver.chrome.driver","//Users//apple//Downloads//chrome-mac-arm64 3.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://tnreginet.gov.in/portal/webHP?requestType=ApplicationRH&actionVal=homePage&screenId=114&UserLocaleID=en&_csrf=6ffc571e-20bb-4ba4-b79d-495b1f39b962#");
		driver.manage().window().maximize();
		
		
	}

}
