package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class REPO_LoginPage {
	@FindBy(name = "username")
	public static WebElement un;
	
	@FindBy(name="password")
	public static WebElement pw;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	public static WebElement signinbutton;

}
