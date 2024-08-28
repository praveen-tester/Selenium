package ADataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ch.qos.logback.core.net.SyslogOutputStream;

public class dp3 {
	
	@Test(dataProvider ="testdata")
	public void m1(String un, String pw ,String name, String o ) {
		System.setProperty("WebDriver.chrome.driver","//Users//apple//Downloads//chrome-mac-arm64 3.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys(un);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(pw);
	    System.out.println(name+o);
		driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
		driver.close();
		
	}
	
	@DataProvider(name="testdata")
	public Object[][] m2() throws IOException
	{
		
		File f1=new File("/Users/apple/eclipse-workspace/Picasso/Test data.xlsx");
		FileInputStream fi=new FileInputStream(f1);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet s1=wb.getSheet("Sheet1");
		int lastrow=s1.getLastRowNum();
		int lastcell=s1.getRow(0).getLastCellNum();
		System.out.println(lastrow);
		System.out.println(lastcell);
		Object[][] data2=new Object[lastrow+1][lastcell+1];
		for(int i=1;i<=lastrow;i++) {
			for(int j=0;j<=lastcell;j++) {
				DataFormatter d1=new DataFormatter();
				String da=d1.formatCellValue(s1.getRow(i).getCell(j));
				data2[i][j]=da;
				System.out.println(da);
				
			}
		}	
		
		return data2;
	}
}
