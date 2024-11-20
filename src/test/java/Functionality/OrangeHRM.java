package Functionality;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import ObjectRepository.REPO_LoginPage;
import ObjectRepository.REPO_PIM;
import ObjectRepository.REPO_Time;
import ObjectRepository.REPO_Admin;
import ObjectRepository.REPO_Leave;

public class OrangeHRM {
	
		WebDriver driver;
		@Test
		public void setup() {
			System.setProperty("Webdriver.chrome.driver","//Users//apple//Downloads//chrome-mac-arm64.exe");
			driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();	
		}
		
		@Test
		public void login() {
			PageFactory.initElements(driver,REPO_LoginPage.class);
			REPO_LoginPage.un.sendKeys("Admin");
			REPO_LoginPage.pw.sendKeys("admin123");
			REPO_LoginPage.signinbutton.click();
		}
		
		@Test
		public void admin() throws InterruptedException {
			PageFactory.initElements(driver,REPO_Admin.class);
			Thread.sleep(4000);
			REPO_Admin.adminbutton.click();
		    Thread.sleep(4000);
			REPO_Admin.adminusername.sendKeys("Praveen@sdtech.in");
			Thread.sleep(4000);
			REPO_Admin.userrole1.click();
			Thread.sleep(4000);
			REPO_Admin.userrole2.click();
			REPO_Admin.employeename1.click();
			REPO_Admin.employeename2.sendKeys("p");
			Thread.sleep(6000);
			Actions a1=new Actions(driver);
			a1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(8000);
			REPO_Admin.status1.click();
			REPO_Admin.status2.click();
			REPO_Admin.search.click();	
		}
		
		@Test
		public void PIM() throws InterruptedException {
			PageFactory.initElements(driver, REPO_PIM.class);
			Actions a1=new Actions(driver);
			Thread.sleep(4000);
			REPO_PIM.PIMButton.click();
			Thread.sleep(4000);
			REPO_PIM.addemployee.click();
			Thread.sleep(4000);
			REPO_PIM.fn.sendKeys("Praveen Kumar");
			Thread.sleep(4000);
			REPO_PIM.ln.sendKeys("R");
			REPO_PIM.savebutton.click();
			Thread.sleep(4000);
            a1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
            Thread.sleep(4000);
            REPO_PIM.nationality1.click();
			Thread.sleep(8000);
			REPO_PIM.nationality2.click();
			Thread.sleep(4000);
			REPO_PIM.maritalstatus1.click();
			Thread.sleep(10000);
			REPO_PIM.maritalstatus2.click();
		    a1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
			Thread.sleep(10000);
			REPO_PIM.gender.click();
			Thread.sleep(5000);
            REPO_PIM.gender2.click();
            Thread.sleep(5000);
            REPO_PIM.savebtn.click();
		}
		
		@Test
		public void leave() throws InterruptedException {
			
			PageFactory.initElements(driver, REPO_Leave.class);
			Thread.sleep(5000);
			REPO_Leave.leave.click();
			Thread.sleep(4000);
			REPO_Leave.leavestatus1.click();
			Thread.sleep(8000);
			REPO_Leave.leavestatus2.click();
			Thread.sleep(4000);
			REPO_Leave.leavetype1.click();
			Thread.sleep(4000);
			REPO_Leave.leavetype2.click();
			Thread.sleep(4000);
			REPO_Leave.searchbtn.click();
			
		}
		
		@Test
		public void time() throws InterruptedException {
			PageFactory.initElements(driver, REPO_Time.class);
			Thread.sleep(10000);
			REPO_Time.timebutton.click();
			Thread.sleep(10000);
			REPO_Time.empname.click();
			Thread.sleep(10000);
			REPO_Time.empname.sendKeys("Praveen Kumar");
		}
		
		@Test
		public void close() {
			driver.quit();
		}
		
		
	}


