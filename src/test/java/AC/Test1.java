package AC;

import org.testng.annotations.Test;
import java.awt.AWTException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class Test1  {
	
	int n=10;
	int n2=1;
   
	
	
	@Test
	public void m1() throws IOException, InterruptedException, AWTException, TesseractException {
		System.setProperty("Webdriver.chrome.driver","//Users//apple//Desktop//Driver//edgedriver_mac64.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://tnreginet.gov.in/portal/webHP?requestType=ApplicationRH&actionVal=homePage&screenId=114&UserLocaleID=en&_csrf=6ffc571e-20bb-4ba4-b79d-495b1f39b962#");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Search/View EC")).click();
		FileReader fr=new FileReader("/Users/apple/eclipse-workspace/Picasso/src/test/java/AC/ac.properties");
		Properties p=new Properties();
		p.load(fr);
		
		for(int i=1;i<=10;i++) {
			Thread.sleep(5000);
			WebElement e1=driver.findElement(By.id("cmb_Zone"));
			Select s1=new Select(e1);
			s1.selectByVisibleText(p.getProperty("Zone"));
			WebElement e2=driver.findElement(By.id("cmb_District"));
			Select s2=new Select(e2);
			s2.selectByVisibleText(p.getProperty("District"));
			WebElement e3=driver.findElement(By.id("cmb_SroName"));
			Select s3=new Select(e3);
			s3.selectByVisibleText(p.getProperty("Sro"));
			WebElement l1=driver.findElement(By.name("txt_PeriodStartDt"));
			l1.click();
			l1.sendKeys(p.getProperty("Sd"));
			Actions a1=new Actions(driver);
			a1.sendKeys(Keys.ENTER).build().perform();
			WebElement l2=driver.findElement(By.name("txt_PeriodEndDt"));
			l2.click();
			l2.sendKeys(p.getProperty("Ed"));
			a1.sendKeys(Keys.ENTER).build().perform();
			
			
		for(int j=n2;j<=n;j++) {
			driver.findElement(By.id("cmb_Village")).sendKeys(p.getProperty("village"));
			driver.findElement(By.id("txt_SurveyNo")).sendKeys(String.valueOf(j));
			driver.findElement(By.id("btn_AddSurvey")).click();
		}
		Thread.sleep(5000);
		WebElement captchaElement = driver.findElement(By.id("captcha"));
		File src=captchaElement.getScreenshotAs(OutputType.FILE);
		
		String path="/Users/apple/eclipse-workspace/Picasso/Captchaimages/Captcha.png";
		
		FileHandler.copy(src, new File(path));
		
		Thread.sleep(2000);	
		
		Tesseract image=new Tesseract();
		image.setDatapath("/Users/apple/eclipse-workspace/Picasso/target/tessdata");
		
		String str=image.doOCR(new File(path));
		
		Thread.sleep(2000);
		
		System.out.print("OCR Done : " +str);
		
		driver.findElement(By.id("txt_Captcha")).sendKeys(str);
		
		Thread.sleep(8000);
		
		
		n=n+10;
		n2=n2+10;
		
		
		
		}
				
	}
}

	
	


