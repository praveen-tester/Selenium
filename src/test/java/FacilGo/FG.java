package FacilGo;

import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FG {

	@Test
	public void m1() throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://" + "nasipadang" + ":" + "every1!day" + "@staging.facilgo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"user_login\"]")).sendKeys("pmcstagingtest@yopmail.com");
		driver.findElement(By.xpath("//input[@id=\"user_password\"]")).sendKeys("Asdf!123");
		driver.findElement(By.xpath("//input[@name=\"commit\"]")).click();
		Thread.sleep(15000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 15000);");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//*[@id=\"js-react-DashboardActionButtons\"]/div/div[2]/div[2]/div/div[1]/button")).click();
		Thread.sleep(10000);
		WebElement l1= driver.findElement(By.xpath("//*[@id='react-select-55--value-item']"));
		l1.click();
		Thread.sleep(5000);
		Actions actions=new Actions(driver);
		actions.sendKeys(l1, "1001 Covewood Court Charlotte, NC 28270").build().perform();
		Thread.sleep(5000);
		actions.sendKeys(Keys.ENTER).build().perform();

		WebElement l2=driver.findElement(By.xpath("//span[@id=\"react-select-60--value\"]"));
		l2.click();
		Thread.sleep(5000);
		actions.sendKeys(l2, "Electrical").build().perform();
		Thread.sleep(5000);
		actions.sendKeys(Keys.ENTER).build().perform();

		WebElement l3=driver.findElement(By.xpath("//span[@id=\"react-select-61--value\"]"));
		l3.click();
		Thread.sleep(5000);
		actions.sendKeys(l3, "Ceiling Fan").build().perform();
		Thread.sleep(5000);
		actions.sendKeys(Keys.ENTER).build().perform();


		WebElement l4=driver.findElement(By.xpath("//span[@id=\"react-select-65--value\"]"));
		l4.click();
		Thread.sleep(5000);
		actions.sendKeys(l4, "Urgent").build().perform();
		Thread.sleep(5000);
		actions.sendKeys(Keys.ENTER).build().perform();


		driver.findElement(By.xpath("/html/body/div[9]/div/div[2]/div/div/div[2]/div[4]/div/div/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder=\"- Item Name -\"]")).sendKeys("Floor");
		driver.findElement(By.xpath("//textarea[@placeholder=\"- Instruction -\"]")).sendKeys("clean");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Create']")).click();
		Thread.sleep(5000);
		String w1=	driver.getWindowHandle();
		Set<String> w2=driver.getWindowHandles();
		Iterator<String>s1=w2.iterator();
		while(s1.hasNext()) {
			String w3=s1.next();
			driver.switchTo().window(w3);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[text()='OK']")).click();
			driver.switchTo().window(w1);
			driver.findElement(By.xpath("//a[text()='Show Recently Created WOs']")).click();

			Thread.sleep(8000);
			Set<String>a1=driver.getWindowHandles();
			Iterator<String>a2=a1.iterator();
			while(a2.hasNext()) {
				String a3=a2.next();
				if(!w1.equals(a3)) {
					driver.switchTo().window(a3);
					Thread.sleep(12000);
					driver.findElement(By.xpath("//*[@id=\"document-scroll-search\"]/div[1]/li/div/a")).click();
					Thread.sleep(10000);
					WebElement k1=driver.findElement(By.xpath("//*[@id=\"js-react-WorkOrderView\"]/div/div[2]/div[5]/div[1]/div/p"));
					String wo1=k1.getText();
					System.out.println(wo1);

				

			driver.switchTo().window(w1);
			Thread.sleep(8000);
			driver.findElement(By.xpath("//button[text()='Close']")).click();	

			Thread.sleep(10000);
			js.executeScript("window.scrollBy(0,-15000);");
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id=\"graph-content-0\"]/div/div[3]/table/tbody/tr[1]/td[3]")).click();
			
			Set<String> b1=driver.getWindowHandles();
			Iterator<String>i1= b1.iterator();
			while(i1.hasNext()) {
				
				String i3=i1.next();
				
				if(!w1.equals(i3)) {
					if(!a3.equals(i3)) {
						driver.switchTo().window(i3);
						Thread.sleep(15000);
						driver.findElement(By.xpath("//*[@id=\"document-scroll-search\"]/div[1]/li/div/a")).click();
						Thread.sleep(10000);
					WebElement j1=driver.findElement(By.xpath("//*[@id=\"js-react-WorkOrderView\"]/div/div[2]/div[5]/div[1]/div/p"));
					String wo2= j1.getText();
					System.out.println(wo2);
					if(wo1.equals(wo2)) {
						System.out.println("Successful");
					}
						
					}
				}
			}
			
			

		}
	}

	
}
}
}
