package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class REPO_Leave {
	
	@FindBy(xpath="//a[@href=\"/web/index.php/leave/viewLeaveModule\"]")
	public static WebElement leave;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div")
	public static WebElement leavestatus1;
	
	@FindBy(xpath="//div[@role=\"option\"]//*[text()=\"Scheduled\"]")
	public static WebElement leavestatus2;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]")
	public static WebElement leavetype1;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div[2]/div[5]")
	public static WebElement leavetype2;
	
	@FindBy(xpath="//div[@class=\"oxd-form-actions\"]//button[@type=\"submit\"]")
	public static WebElement searchbtn;

}
