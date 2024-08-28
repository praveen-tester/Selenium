package Picassoweb;

import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Website {
	WebDriver driver;
	

	@BeforeSuite
	public void setup() {
		System.setProperty("WebDriver.chrome.driver","//Users//apple//Downloads//chrome-mac-arm64 3.exe");
		driver=new ChromeDriver();
		driver.get("https://test.sustenos.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void Topnavigationvalidation() throws InterruptedException {
		Thread.sleep(10000);
	   List<WebElement> l1=driver.findElements(By.xpath("//ul[@class=\"header-navbar\"]//li"));
		for(WebElement e1:l1) {
			String nav1=e1.getText();
			if(nav1.equalsIgnoreCase("About us")||nav1.equalsIgnoreCase("Process")||nav1.equalsIgnoreCase("Services")||nav1.equalsIgnoreCase("Features")
					||nav1.equalsIgnoreCase("Pricing")||nav1.equalsIgnoreCase("Our works")||nav1.equalsIgnoreCase("FAQ")) {
				System.out.println("Top naviagtion "+ nav1);
				//e1.click();
				
				Thread.sleep(5000);
				WebElement i1=driver.findElement(By.xpath("//div[@class=\"section-header\"]"));
				String buttonname=i1.getText();
				if(buttonname.equalsIgnoreCase("About us")||buttonname.equalsIgnoreCase("Process")||buttonname.equalsIgnoreCase("Services")||buttonname.equalsIgnoreCase("Features")
						||buttonname.equalsIgnoreCase("Pricing")||buttonname.equalsIgnoreCase("Our works")||buttonname.equalsIgnoreCase("FAQ")) {
					System.out.println(nav1+" Navigation successful");
					driver.findElement(By.xpath("//div[@class=\"header-flex-logo\"]")).click();
					Thread.sleep(5000);
					continue;
				}else {
					System.out.println(nav1+" Navigation failed");
					continue;
				}
			}else {
				System.out.println(nav1+ " Navigation is failed");
				
			}
				
			}
		}
	
	@AfterSuite
	public void teardown() {
		driver.close();
	}

}
