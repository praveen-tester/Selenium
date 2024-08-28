package ADataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dp2 {
	
	@Test(dataProvider="datas")
	public void m1(Object un) {
//		System.setProperty("WebDriver.chrome.driver","//Users//apple//Downloads//chrome-mac-arm64 3.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys();
//		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys();
//		driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
//		driver.close();
		System.out.println(un);
		
	}

	@DataProvider(name="datas")
	public Object[] m2() {
		Object[]a1=new Object[2];
		a1[0]="Praveen";
		a1[1]="Kumar";
		
		return a1;
}
}
