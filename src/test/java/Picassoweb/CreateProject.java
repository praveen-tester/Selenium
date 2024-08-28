package Picassoweb;

import org.testng.annotations.Test;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CreateProject {
	WebDriver driver;
	ChromeOptions c1=new ChromeOptions();
	FileReader fr;
	Properties p;
	
	

	@BeforeSuite
	public void setup() throws IOException {
		System.setProperty("WebDriver.chrome.driver","//Users//apple//Downloads//chrome-mac-arm64 3.exe");
		c1.addArguments("--disable-notifications");
		driver=new ChromeDriver(c1);	
	    fr=new FileReader("/Users/apple/eclipse-workspace/Picasso/src/test/java/Picasso.properties");
		p=new Properties();
		p.load(fr);
		
	}
	
	@Test
	public void Signin() throws InterruptedException, AWTException {
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_SHIFT);
		r1.keyPress(KeyEvent.VK_CONTROL);
		r1.keyPress(KeyEvent.VK_N);
		r1.keyRelease(KeyEvent.VK_SHIFT);
		r1.keyRelease(KeyEvent.VK_CONTROL);
		r1.keyRelease(KeyEvent.VK_N);
		Thread.sleep(5000);
		driver.navigate().to(p.getProperty("url1"));
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@alt=\"Google\"]")).click();
		String parentwindow=driver.getWindowHandle();
		Thread.sleep(4000);
		Set<String> childwindow= driver.getWindowHandles();
		for(String cw:childwindow) {
			if(!(cw.equals(parentwindow))) {
				driver.switchTo().window(cw);
				Thread.sleep(5000);
				driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys(p.getProperty("email"));
				driver.findElement(By.id("identifierNext")).click();
				Thread.sleep(4000);
				driver.findElement(By.name("Passwd")).sendKeys(p.getProperty("pw"));
				driver.findElement(By.id("passwordNext")).click();
				driver.switchTo().window(parentwindow);
				Thread.sleep(10000);
				String cur=driver.getCurrentUrl();
				System.out.println(cur);
				if(cur.equalsIgnoreCase("https://app-stage.sustenos.com/company/onboarding/step1")) {
					driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[1]/div/div[1]/div/label[2]")).click();

				}
				else {
					Thread.sleep(10000);
					driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/div[1]/button[2]")).click();
				}
				}

			}
		}
	
		@AfterSuite
		public void close() {
			driver.quit();
		}

}

