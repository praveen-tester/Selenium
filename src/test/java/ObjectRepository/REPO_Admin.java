package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class REPO_Admin {
	
	@FindBy(css = "a[href=\"/web/index.php/admin/viewAdminModule\"]")
	public static WebElement adminbutton;
	
	@FindBy(xpath = "//div[@class=\"oxd-grid-item oxd-grid-item--gutters\"]//input[@class=\"oxd-input oxd-input--active\"]")
	public static WebElement adminusername;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]")
	public static WebElement userrole1;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div[2]/div[3]")
	public static WebElement userrole2;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div")
	public static WebElement employeename1;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/input")
	public static WebElement employeename2;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]")
	public static WebElement status1;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div[2]/div[2]")
	public static WebElement status2;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	public static WebElement search;
	


}


