package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class REPO_Time {
	
	
	@FindBy(xpath = "//a[@href=\"/web/index.php/time/viewTimeModule\"]")
	public static WebElement timebutton;
	
	@FindBy(xpath="//div[@class=\"oxd-grid-item oxd-grid-item--gutters\"]//div[@class=\"oxd-autocomplete-wrapper\"]")
	public static WebElement empname;

}
