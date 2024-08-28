package ADataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dp1 {

	@Test(dataProvider ="testdatas")
	public void test(String un, String pw) {
		System.setProperty("WebDriver.chrome.driver","//Users//apple//Downloads//chrome-mac-arm64 3.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys(un);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(pw);
		driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
		driver.close();

	}
	@DataProvider(name="testdatas")
	public Object[][]testdata() {
		Object[][]test=new Object[2][2];
		test[0][0]="Admin";
		test[0][1]="admin123";
		test[1][0]="Admin";
		test[1][1]="admin123";
		return test;


	}

}
