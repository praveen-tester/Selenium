package Picassoweb;

import org.testng.annotations.Test;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BrokenLinks {
	WebDriver driver;
	int brokenImageCount = 0;
	int fineImageCount = 0;
	int errorimage=0;

	@BeforeTest
	public void setup() {
		System.setProperty("Webdriver.chrome.driver","//Users//apple//Downloads//chrome-mac-arm64 3.exe");
		driver=new ChromeDriver();
		driver.get("https://test.sustenos.com/");
		driver.manage().window().maximize();
	}
	@Test( priority =0)
	public void totalink() throws IOException {
		List<WebElement>img=driver.findElements(By.tagName("img"));	
		int size=img.size();
		System.out.println("Total count img "+ size);
		for(WebElement images:img) {
			String im=images.getAttribute("src");
			try {
				URL url = new URL(im);
				HttpURLConnection connection=(HttpURLConnection)url.openConnection();
				connection.setRequestMethod("HEAD");
				int responsecode=connection.getResponseCode();
				if(responsecode>=400) {
					System.out.println("Broken image found: " + im);
					brokenImageCount++; 

				}else {
					System.out.println("Image is loading fine: " + im);
					fineImageCount++;	

				}
			}catch(Exception e) {	
				System.out.println("Error occured for this img url"+ im);
				errorimage++;


			}
		}
	}
	@Test(priority=1)
	public void totalcount() {
		System.out.println("brokenImageCount"+ brokenImageCount);
		System.out.println("fineImageCount"+fineImageCount);
		System.out.println("Error imagecount"+ errorimage);


	}
}
